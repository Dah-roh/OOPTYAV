public class User extends GeneralAbstract {

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(String role) {
        this.role = role;
    }

}
