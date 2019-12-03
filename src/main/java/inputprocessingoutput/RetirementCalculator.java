package inputprocessingoutput;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    int currentAge = getAge();
    int retirementAge = getRetirementAge();
    int year = LocalDate.now().getYear();
    int leftUntilRetirement = retirementAge - currentAge;
    int yearOfRetirement = year + leftUntilRetirement;


    private int getAge(){
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getRetirementAge(){
        System.out.println("At what age would you like to retire?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public void calculate(){
        System.out.println("You have " + leftUntilRetirement + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + yearOfRetirement + ".");

    }

    public static void main(String[] args) {
        RetirementCalculator retirementCalculator = new RetirementCalculator();
        retirementCalculator.calculate();
    }
}
