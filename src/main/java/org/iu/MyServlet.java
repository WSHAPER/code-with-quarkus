package org.iu;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/test")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String acceptHeader = request.getHeader("Accept");
        System.out.println(acceptHeader);
        response.addHeader("FOO", "BAR");
        response.getWriter().append("Hello World");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        System.out.println(firstName);
        System.out.println("received POST Request ");
        response.sendRedirect(request.getContextPath() + "/index.html");
    }
}