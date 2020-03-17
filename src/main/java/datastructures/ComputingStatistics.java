package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {
    private String userInput = getInput();
    private List<Integer> values = new ArrayList<Integer>();


    private void analiseAndProcessInput() {
        // this analyses and processes the input.
        if (userInput.isEmpty()) {
            System.out.println("The field cannot be empty!");
            userInput = getInput();
            analiseAndProcessInput();
        }
        checkIfDoneCommand();
        checkThatInputIsNumeric();
        if (userInput.matches("[*0-9]")) {
            values.add(Integer.parseInt(userInput));
        }
        userInput = getInput();
        analiseAndProcessInput();
    }
    public void calculateValues() {
        // this method calculates the values for both the average and standard deviation
        int numberOfValues = values.size();
        double sum = 0;
        for (int i = 0; i < numberOfValues; i++) {
            sum += values.get(i);
        }
        double average = sum / numberOfValues;

        double differenceFromMean = 0;
        for (int i = 0; i < numberOfValues; i++) {
            int value = values.get(i);
            differenceFromMean += Math.pow((sum - value), 2);
        }
        double meanOfSquaredValues = differenceFromMean / numberOfValues;
        double standardDeviation = Math.sqrt(meanOfSquaredValues);

        System.out.println("The average is: " + average + ".");
        System.out.println("The minimum is: " + Collections.min(values) + ".");
        System.out.println("The maximum is: " + Collections.max(values) + ".");
        System.out.println("The standard deviation is: " + standardDeviation + ".");
        return;
    }

    public void checkThatInputIsNumeric() {
        // this method checks if the input is numeric and if not, asks for it again and re checks it
        if (userInput.matches("[a-zA-Z]")) {
            System.out.println("A value can only have numbers.");
            userInput = getInput();
            analiseAndProcessInput();
        }
    }

    public void checkIfDoneCommand() {
        // this checks if there is a done command in the input strings
        if (userInput.equals("done")) {
            System.out.println("Ok. Calculating values!");
            calculateValues();
        }
    }

    public String getInput() {
        // this gets the input from the user
        System.out.println("Enter a value:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        ComputingStatistics computingStatistics = new ComputingStatistics();
        computingStatistics.analiseAndProcessInput();
    }
}
