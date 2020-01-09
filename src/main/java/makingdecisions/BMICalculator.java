package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    double height = getHeight();
    double weight = getWeight();
    double bmi = (weight / (height * height)) * 703;


    public void calculate() {
        if (bmi < 25 && bmi > 18.5) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are within the ideal weight range.");
        } else if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmi > 25) {
            System.out.println("Your BMI is " + bmi + ".");
            System.out.println("You are overweight. You should see a doctor.");
        }
    }

    public double getHeight() {
        try {
            System.out.println("What is your height in inches?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value!");
        }
        return getHeight();
    }

    public double getWeight() {
        try {
            System.out.println("What is your weight in pounds?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value!");
        }
        return getWeight();
    }

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.calculate();

    }
}
