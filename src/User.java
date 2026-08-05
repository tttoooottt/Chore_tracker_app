import java.util.ArrayList;
import java.util.List;

public class User {
    // Attributes
    private String username;
    private String email;
    private String password;
    private List<Household> household;

    // Constructor
    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.household = new ArrayList<>();
    }

    // Getters and Methods
    public String getUsername() {
        return this.username;
    }
}