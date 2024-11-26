import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM usuarios";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                users.add(new User(id, nombre, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}

