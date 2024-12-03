<%@ page import="java.util.*" %>
<%@ page import="com.alumnos.Usuario" %>
<html>
<head>
    <title>Lista de Usuarios</title>
</head>
<body>
    <h1>Lista de Usuarios</h1>
    <%
        // Obtener la lista de usuarios que el Servlet ha pasado
        List<Usuario> users = (List<Usuario>) request.getAttribute("users");

        if (users == null || users.isEmpty()) {%>

            <p>No hay usuarios disponibles.</p>
    <%
        } else {
            System.out.println("<table border='1'>");
            System.out.println("<table border='1'>");
            for (Usuario user : users) {
                System.out.println("<tr>");
                System.out.println("<td>" + user.getId() + "</td>");
                System.out.println("<td>" + user.getNombre() + "</td>");
                System.out.println("<td>" + user.getEmail() + "</td>");
                System.out.println("</tr>");
            }
            System.out.println("</table>");
        }
    %>
</body>
</html>


