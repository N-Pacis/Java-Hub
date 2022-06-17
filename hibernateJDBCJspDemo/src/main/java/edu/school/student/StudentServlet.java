package edu.school.student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import edu.school.student.DAO.StudentDao;
import edu.school.student.models.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(name = "Students",value = "/")
public class  StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StudentDao studentDao;

    public void init() {
        String jdbcURL =  getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        studentDao = new StudentDao(jdbcURL, jdbcUsername, jdbcPassword);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertStudent(request, response);
                    break;
                case "/delete":
                    deleteStudent(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateStudent(request, response);
                    break;
                default:
                    listStudent(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Student> listStudent = studentDao.listAllStudents();
        request.setAttribute("listStudent", listStudent);
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentList.jsp");
        dispatcher.forward(request, response);
    }
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("add_student.jsp");
        dispatcher.forward(request, response);
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        Student existingStudent = studentDao.getStudent(new Student(new Long(id)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("add_student.jsp");
        request.setAttribute("student", existingStudent);
        dispatcher.forward(request, response);
    }
    private void insertStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        Student newStudent = new Student(firstName, lastName, gender);

        studentDao.insertStudent(newStudent);
        response.sendRedirect("list");
    }
    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("firstName");
        String author = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        Student student = new Student(Long.valueOf(id), title, author, gender);
        studentDao.updateStudent(student);
        response.sendRedirect("list");
    }
    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = new Student(Long.valueOf(id));
        studentDao.deleteStudent(student);
        response.sendRedirect("list");
    }
}