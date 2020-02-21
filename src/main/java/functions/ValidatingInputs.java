package functions;

import java.util.Scanner;

public class ValidatingInputs {
    String firstName = getFirstName();
    String lastName = getLastName();
    String zipCode = getZipCode();
    String employeeId = getEmployeeId();
    int errorCount = 0;


    public void validateInput(){
        checkFirstName();
        checkLastName();
        checkZipCode();
        matchesPattern();

        if (errorCount == 0){
            System.out.println("There were no errors found.");
        }
    }

    public void checkFirstName(){
        if (firstName.isEmpty()){
            System.out.println("The first name must be filled in!");
            errorCount++;
        } else if (firstName.length() <= 2){
            System.out.println("\"" + firstName + "\"" + " is not a valid first name. It is too short.");
            errorCount++;
        }
    }

    public void checkLastName(){
        if (lastName.isEmpty()){
            System.out.println("The last name must be filled in!");
            errorCount++;
        } else if (lastName.length() <= 2){
            System.out.println("\"" + lastName + "\"" + " is not a valid last name. It is too short.");
            errorCount++;
        } else if (lastName.contains("0-9")){
            System.out.println("A name can only have letters.");
        }
    }

    public void checkZipCode(){
        if (!zipCode. matches("-?\\d+(\\.\\d+)?")){
            System.out.println("The ZIP code must be a number!");
            errorCount++;
        }
    }

    public void matchesPattern(){
        String employeeIdPattern = "AA-1234";

        if (!employeeIdPattern.matches("([A-Z]{2})+[-](\\d{4})")){
            System.out.println(employeeId + " is not a valid ID!");
            errorCount++;
        }
    }

    public String getFirstName() {
        System.out.println("Enter the first name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String getLastName() {
        System.out.println("Enter the last name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String getZipCode(){
        System.out.println("Enter the zip code:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String getEmployeeId(){
        System.out.println("Enter the employee ID:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        ValidatingInputs validatingInputs = new ValidatingInputs();
        validatingInputs.validateInput();
    }
}
