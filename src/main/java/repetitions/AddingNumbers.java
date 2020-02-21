package repetitions;

import java.util.Scanner;

public class AddingNumbers {
    double sum = 0;

    public void askForInput() {
        for (int input = 1; input < 6; input++) {
            sum = sum + getUserInput();
        }
        System.out.println("The total is " + sum);
    }

    public double getUserInput() {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        AddingNumbers addingNumbers = new AddingNumbers();
        addingNumbers.askForInput();
    }
}
