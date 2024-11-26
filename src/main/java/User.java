public class User {
    private int id;
    private String nombre;
    private String email;

    // Constructor
    public User(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
