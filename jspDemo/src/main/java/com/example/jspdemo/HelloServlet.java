package com.example.jspdemo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name="helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path){
            case "/add":
                RequestDispatcher dispatcher1 =  request.getRequestDispatcher("add.jsp");
                dispatcher1.forward(request, response);
                break;
            case "/list":
                String[] students = {"John","Doe"};
                request.setAttribute("studentsList",students);
                RequestDispatcher dispatcher2 =  request.getRequestDispatcher("list.jsp");
                dispatcher2.forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}