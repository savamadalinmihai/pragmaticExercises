package functions;

import makingdecisions.PasswordValidation;

import java.util.Scanner;

public class PasswordStrengthIndicator {
    String password = getPasswordFromUser();
    int count = hasEightCharacters()+hasLessThanEightNumbers()+hasLessThanEightLetters()+hasSymbols();


    public void checkPassword() {
        switch (count) {
            case 1:
                System.out.println(password + " is a very weak password.");
                break;
            case 2:
                System.out.println(password + " is a weak password.");
                break;
            case 3:
                System.out.println(password + " is a strong password.");
                break;
            case 4:
                System.out.println(password + " is a very strong password.");
                break;
            default:
                System.out.println("Try again.");
        }
    }

    public int hasLessThanEightLetters() {
        int value;
        if (password.matches("[a-z,A-Z]")) {
            value = 1;
            return value;
        }else {
            value = 0;
            return value;
        }
    }

    public int hasLessThanEightNumbers() {
        int value;
        if (password.matches("[0-9]")) {
            value = 1;
            return value;
        }else {
            value = 0;
            return value;
        }
    }

    public int hasEightCharacters() {
        int value;
        if (password.length() >= 8) {
            value = 1;
            return value;
        }else {
            value = 0;
            return value;
        }
    }


    public int hasSymbols() {
        int value;
        if (password.contains("!#$%&'()*+,-./:;<=>?@[]^_`{|}~")) {
            value = 1;
            return value;
        }else {
            value = 0;
            return value;
        }
    }

    public String getPasswordFromUser() {
        System.out.println("Enter a password for strength check: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        passwordStrengthIndicator.checkPassword();
    }
}
