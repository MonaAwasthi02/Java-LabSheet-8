public class UserBean {
    private String password;

    // Write-only property: setter is present, getter is intentionally absent.
    public void setPassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        this.password = password;
    }

    // This method demonstrates internal use without exposing the password.
    public boolean authenticate(String candidate) {
        return password != null && password.equals(candidate);
    }
}
