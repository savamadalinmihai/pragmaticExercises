package makingdecisions;
import java.util.Scanner;

public class PasswordValidation {
    String user = getUser();

    public void validate(){
        String password = getPassword();
        if (password.equals("ABC$123")){
            System.out.println("Careful! The password is case sensitive!");
            System.out.println("Please try again!");
            System.out.println("");
            validate();
        } else if (!password.equals("abc$123")){
            System.out.println("I don't know you!");
            System.out.println("Please try again!");
            System.out.println("");
            validate();
        }else{
            System.out.println("Welcome, " + user + "!");
        }
    }

    public String getUser(){
        System.out.println("Hi! Please enter the username!");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public String getPassword(){
        System.out.println("Please enter the password.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    public static void main(String[] args) {
        PasswordValidation passwordValidation = new PasswordValidation();
        passwordValidation.validate();

    }
}
