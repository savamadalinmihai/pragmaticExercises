package repetitions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingBadInput {


    public void calculate() {
        double input = userInput();

        if (input == 0) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.println("");
            calculate();
        } else {
            double years = 72 / input;
            System.out.println("It will take you " + years + " years to double your initial investment.");
        }
    }

    public double userInput() {
        System.out.println("What is the rate of return?");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.println("");
            return userInput();
        }
    }

    public static void main(String[] args) {
        HandlingBadInput handlingBadInput = new HandlingBadInput();
        handlingBadInput.calculate();
    }
}
