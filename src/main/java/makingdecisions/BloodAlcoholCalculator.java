package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    double weight = getWeight();
    String gender = getGender();
    int numberOfDrinks = getNumberOfDrinks();
    double alcoholByVolume = getAlcoholByVolume();
    int numberOfHours = getNumberOfHours();
    double totalAlcoholConsumed = (alcoholByVolume / 100) * (numberOfDrinks * 12);
    double rForWomen = 0.66;
    double rforMen = 0.73;


    public void decideMethod() {
        if (gender.equals("female")) {
            calculateForWomen();
        } else if (gender.equals("male")) {
            calculateForMen();
        }
    }

    public void calculateForMen() {
        double BAC = ((totalAlcoholConsumed * 5.14) / weight * rforMen) - (0.015 * numberOfHours);
        if (BAC >= 0.08) {
            System.out.format("Your BAC is %.2f", BAC);
            System.out.print(".");
            System.out.println("");
            System.out.println("It is not legal for you to drive");
        } else if (BAC <= 0.07) {
            System.out.format("Your BAC is %.2f", BAC);
            System.out.print(".");
            System.out.println("");
            System.out.println("It is legal for you to drive");
        }
    }

    public void calculateForWomen() {
        double BAC = ((totalAlcoholConsumed * 5.14) / weight * rForWomen) - (0.015 * numberOfHours);
        if (BAC >= 0.08) {
            System.out.format("Your BAC is %.2f", BAC);
            System.out.print(".");
            System.out.println("");
            System.out.println("It is not legal for you to drive");
        } else if (BAC <= 0.07) {
            System.out.format("Your BAC is %.2f", BAC);
            System.out.print(".");
            System.out.println("");
            System.out.println("It is legal for you to drive");
        }
    }

    public double getWeight() {
        try {
            System.out.println("What is your weight?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        }
        return getWeight();
    }

    public String getGender() {
        System.out.println("What is your gender?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int getNumberOfDrinks() {
        try {
            System.out.println("How many drinks did you have?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        }
        return getNumberOfDrinks();
    }

    public double getAlcoholByVolume() {
        try {
            System.out.println("What was the percentage of alcohol per drink?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        }
        return getAlcoholByVolume();
    }

    public int getNumberOfHours() {
        try {
            System.out.println("How many hours have passed since your last drink?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
        }
        return getNumberOfHours();
    }


    public static void main(String[] args) {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.decideMethod();
    }
}
