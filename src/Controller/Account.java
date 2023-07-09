package Controller;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Account")
public class Account {
    
    private String email;
    private String username;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }




    public String getEmail() {
        return email;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


}