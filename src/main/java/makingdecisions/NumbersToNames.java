package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersToNames {
    int number = getNumber();

    public void validator() {
        while (number < 1 || number > 12) {
            System.out.println("Please enter a number between 1 and 12.");
            translateAgain();
            if (number >= 1 && number <= 12) {
                translate();
                break;
            }
        }
    }

    public void translate() {
        switch (number) {
            case 1:
                System.out.println("The name of the month is January.");
                break;
            case 2:
                System.out.println("The name of the month is February.");
                break;
            case 3:
                System.out.println("The name of the month is March.");
                break;
            case 4:
                System.out.println("The name of the month is April.");
                break;
            case 5:
                System.out.println("The name of the month is May.");
                break;
            case 6:
                System.out.println("The name of the month is June.");
                break;
            case 7:
                System.out.println("The name of the month is July.");
                break;
            case 8:
                System.out.println("The name of the month is August.");
                break;
            case 9:
                System.out.println("The name of the month is September.");
                break;
            case 10:
                System.out.println("The name of the month is October.");
                break;
            case 11:
                System.out.println("The name of the month is November.");
                break;
            case 12:
                System.out.println("The name of the month is December.");
                break;
        }
    }

    public void translateAgain() {
        int number = getNumber();
        switch (number) {
            case 1:
                System.out.println("The name of the month is January.");
                break;
            case 2:
                System.out.println("The name of the month is February.");
                break;
            case 3:
                System.out.println("The name of the month is March.");
                break;
            case 4:
                System.out.println("The name of the month is April.");
                break;
            case 5:
                System.out.println("The name of the month is May.");
                break;
            case 6:
                System.out.println("The name of the month is June.");
                break;
            case 7:
                System.out.println("The name of the month is July.");
                break;
            case 8:
                System.out.println("The name of the month is August.");
                break;
            case 9:
                System.out.println("The name of the month is September.");
                break;
            case 10:
                System.out.println("The name of the month is October.");
                break;
            case 11:
                System.out.println("The name of the month is November.");
                break;
            case 12:
                System.out.println("The name of the month is December.");
                break;
        }
    }

    public int getNumber() {
        try {
            System.out.println("Please enter the number of the month: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Choose a number from 1 to 12.");
            System.out.println("");
        }
        return getNumber();
    }

    public static void main(String[] args) {
        NumbersToNames numbersToNames = new NumbersToNames();
        numbersToNames.validator();
    }
}
