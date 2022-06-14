package controller;

import models.Student;
import serviceImpl.StudentServiceImpl;
import services.StudentService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.servlet.RequestDispatcher;
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
        System.out.println(action);
        try{
            switch (action){
                case "/new":
                    studentRegistrationForm(request,response);
                    break;
                case "/insert":
                    System.out.println("here");
                    insertStudent(request,response);
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

    private void insertStudent(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String yearEnrolled = request.getParameter("yearEnrolled");

        Student student = new Student(firstname,lastname,yearEnrolled);
        studentService.addStudent(student);
        response.sendRedirect("list");
    }
}
