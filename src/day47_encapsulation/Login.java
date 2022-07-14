package day47_encapsulation;

public class Login {

    private String username;
    private String password;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) { //ab;ity to access and assign
            this.password = password;
        }
    }
    public String getUsername(){ //returns the value
        return username;
    }
    public String getPassword(){
        return password;
    }
}