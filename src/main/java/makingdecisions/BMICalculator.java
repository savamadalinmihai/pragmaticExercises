package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    String metricOrImperial = getMetricOrImperial();

    public void checkerMethod() {
        if (metricOrImperial.matches("[MmIi]")) {
            decideMethod();
        } else {
            System.out.println("Please enter one of the two options.");
            checkerMethod();
        }
    }

    public void decideMethod() {
        if (metricOrImperial.equalsIgnoreCase("M")) {
            System.out.println("You chose the Metric system. For this, please use cm and kg");
            calculateMetric();
        } else if (metricOrImperial.equalsIgnoreCase("I")) {
            System.out.println("You chose the Imperial system. For this, please specify your height in inches" +
                    " and your weight in pounds");
            calculateImperial();
        }
    }

    public void calculateMetric() {
        double height = getHeight();
        double weight = getWeight();
        double bmiMetric = (weight / (height * height)) * 10000;

        if (bmiMetric < 25 && bmiMetric > 18.5) {
            System.out.format("Your BMI is %.1f", bmiMetric);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are within the ideal weight range.");
        } else if (bmiMetric < 18.5) {
            System.out.format("Your BMI is %.1f", bmiMetric);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmiMetric > 25) {
            System.out.format("Your BMI is %.1f", bmiMetric);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are overweight. You should see a doctor.");
        }
    }

    public void calculateImperial() {
        double height = getHeight();
        double weight = getWeight();
        double bmiImperial = Math.round((weight / (height * height)) * 703);

        if (bmiImperial < 25 && bmiImperial > 18.5) {
            System.out.format("Your BMI is %.1f", bmiImperial);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are within the ideal weight range.");
        } else if (bmiImperial < 18.5) {
            System.out.format("Your BMI is %.1f", bmiImperial);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmiImperial > 25) {
            System.out.format("Your BMI is %.1f", bmiImperial);
            System.out.print(".");
            System.out.println("");
            System.out.println("You are overweight. You should see a doctor.");
        }
    }

    public String getMetricOrImperial() {
        System.out.println("What units would you like to use?");
        System.out.println("");
        System.out.println("For METRIC, please press M. ");
        System.out.println("For IMPERIAL, please press I. ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public double getHeight() {
        try {
            System.out.println("What is your height?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value!");
        }
        return getHeight();
    }

    public double getWeight() {
        try {
            System.out.println("What is your weight?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value!");
        }
        return getWeight();
    }

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.checkerMethod();

    }
}
