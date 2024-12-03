package com.alumnos;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.List;
import jakarta.servlet.http.HttpServlet;


@WebServlet(name = "UserServlet", value = "/index")
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Obtener la lista de usuarios desde la base de datos
        UserDAO userDAO = new UserDAO();
        List<Usuario> users = userDAO.getAllUsers();

        // Pasar la lista de usuarios a la JSP
        request.setAttribute("users", users);

        // Redirigir a la página JSP
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

