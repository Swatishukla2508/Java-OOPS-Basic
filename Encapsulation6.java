class Security {
    private String username;
    private String password;

    void setusername(String usernmae) {
        this.username = username;
    }

    void setpassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least8 characters");

        } else {
            this.password = password;
        }

    }

    String getusername() {
        return username;
    }

    String getpassword() {
        return password;
    }

}

public class Encapsulation6 {
    public static void main(String[] args) {
        Security S1 = new Security();
        S1.setusername("Khushi");

        S1.setpassword("mypassword");

        System.out.println("Username: " + S1.getusername());
        System.out.println("Password: " + S1.getpassword());
    }

}
