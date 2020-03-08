package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {
    private String userInput = getInput();
    private List<Integer> values = new ArrayList<>();


    private void analiseAndProcessInput() {
        checkThatInputIsNumeric();
        checkIfDoneCommand();
        try {
            values.add(Integer.parseInt(userInput));
        } catch (NumberFormatException e) {
            checkIfDoneCommand();
            checkThatInputIsNumeric();
            analiseAndProcessInput();
            userInput = getInput();
            checkThatInputIsNumeric();
        }
        if (userInput.isEmpty())
            System.out.println("The field cannot be empty!");

        analiseAndProcessInput();

    }

    public void calculateValues() {
        int numberOfValues = values.size() + 1;
        double sum = 0;
        for (int i = 0; i < numberOfValues; i++){
            sum += values.get(i);
        }
        double average = sum / numberOfValues;

        double differenceFromMean = 0;
        for (int i = 0; i < values.size(); i++){
            differenceFromMean += Math.pow(sum - values.get(i), 2);
        }
        double meanOfSquaredValues = differenceFromMean / numberOfValues;
        double standardDeviation = Math.sqrt(meanOfSquaredValues);

        System.out.println("The average is: " + average);
        System.out.println("The standard deviation is: " + standardDeviation);

    }

    public void checkThatInputIsNumeric() {
        if (userInput.matches("[a-zA-Z]")) {
            System.out.println("A value can only have numbers.");
            userInput = getInput();
            analiseAndProcessInput();
        }
    }

    public void checkIfDoneCommand() {
        if (userInput.equals("done")) {
            System.out.println("Ok. Calculating values!");
            calculateValues();
        }
    }

    public String getInput() {
        System.out.println("Enter a value:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        ComputingStatistics computingStatistics = new ComputingStatistics();
        computingStatistics.analiseAndProcessInput();
    }
}
