<%@ page import="java.util.*, yourpackage.User" %>
<html>
<head>
    <title>Lista de Usuarios</title>
</head>
<body>
    <h1>Lista de Usuarios</h1>
    <%
        // Obtener la lista de usuarios que el Servlet ha pasado
        List<User> users = (List<User>) request.getAttribute("users");

        if (users == null || users.isEmpty()) {
            out.println("<p>No hay usuarios disponibles.</p>");
        } else {
            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Nombre</th><th>Email</th></tr>");
            for (User user : users) {
                out.println("<tr>");
                out.println("<td>" + user.getId() + "</td>");
                out.println("<td>" + user.getNombre() + "</td>");
                out.println("<td>" + user.getEmail() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }
    %>
</body>
</html>


