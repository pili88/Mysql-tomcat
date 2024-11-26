import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.List;
import javax.servlet.http.HttpServlet;


public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Establecer el tipo de contenido
        response.setContentType("text/html");

        // Obtener la lista de usuarios desde la base de datos
        UserDAO userDAO = new UserDAO();
        List<User> users = userDAO.getAllUsers();

        // Pasar la lista de usuarios a la JSP
        request.setAttribute("users", users);

        // Redirigir a la página JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}

