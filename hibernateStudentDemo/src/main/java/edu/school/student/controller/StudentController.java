package edu.school.student.controller;

import edu.school.student.enums.EGender;
import edu.school.student.models.Student;
import edu.school.student.serviceImpl.StudentServiceImpl;
import edu.school.student.services.StudentService;
import jakarta.servlet.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name ="studentServlet",value = "/")
public class StudentController extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        try{
            switch (action){
                case "/new":
                    studentRegistrationForm(request,response);
                    break;
                case "/insert":
                    insertStudent(request,response);
                    break;
                case "/delete":
                    deleteStudent(request,response);
                    break;
                case "/edit":
                    studentEditForm(request,response);
                    break;
                case "/update":
                    updateStudent(request,response);
                    break;
                default:
                    listStudents(request,response);
                    break;
            }
        }
        catch (SQLException ex){
            throw new ServletException(ex);
        }
    }

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
        List<Student> listStudents = studentService.listAllStudents();
        request.setAttribute("students",listStudents);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/student-list.jsp");
        dispatcher.forward(request,response);
    }

    private void studentRegistrationForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/add-student.jsp");
        dispatcher.forward(request,response);
    }

    private void studentEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(Integer.parseInt(request.getParameter("id")));
        Student student = studentService.getStudentById(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/add-student.jsp");
        request.setAttribute("student",student);
        requestDispatcher.forward(request,response);
    }

    private void insertStudent(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String yearEnrolled = request.getParameter("yearEnrolled");
        EGender gender = EGender.valueOf(request.getParameter("gender"));

        Student student = new Student(firstname,lastname,yearEnrolled,gender);
        studentService.addStudent(student);
        response.sendRedirect("list");
    }

    private void updateStudent(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String yearEnrolled = request.getParameter("yearEnrolled");
        EGender gender = EGender.valueOf(request.getParameter("gender"));
        Student student = new Student(id,firstname,lastname,yearEnrolled,gender);
        studentService.updateStudent(student);
        response.sendRedirect("list");
    }

    private void deleteStudent(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        studentService.deleteStudent(id);
        response.sendRedirect("list");
    }
}
