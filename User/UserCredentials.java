package gr.aueb.cf.User;

public class UserCredentials {

    private long id;
    private String username;
    private String password;

    /*
    Constructors
     */
    public UserCredentials(){

    }
    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /*
    Getters
     */

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /*
    Setters
     */

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
