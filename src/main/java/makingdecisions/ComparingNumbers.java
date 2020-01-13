package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparingNumbers {
    int numberOne = getNumberOne();
    int numberTwo = getNumberTwo();
    int numberThree = getGetNumberThree();

    public void compareNumbers() {
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("The largest number is " + numberOne + ".");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("The largest number is " + numberTwo + ".");
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("The largest number is " + numberThree + ".");
        }
    }

    public int getNumberOne() {
        try {
            System.out.println("Enter the first number:");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only compare numbers!");
        }
        return getNumberOne();
    }

    public int getNumberTwo() {
        try {
            System.out.println("Enter the second number:");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only compare numbers!");
        }
        return getNumberTwo();
    }

    public int getGetNumberThree() {
        try {
            System.out.println("Enter the third number:");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only compare numbers!");
        }
        return getGetNumberThree();
    }

    public static void main(String[] args) {
        ComparingNumbers comparingNumbers = new ComparingNumbers();
        comparingNumbers.compareNumbers();
    }
}
