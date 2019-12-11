package calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    int principal = getPrincipal();
    double rateOfInterest = getRateOfInterest();
    double rateForCalculations = rateOfInterest/100;
    int years = getYears();
    double ammountAfterInvestment = principal*(1 + (rateForCalculations*years));
    int roundedAmmount = (int)ammountAfterInvestment;
    char dollar = '$';

    public void start(){
        System.out.println("After " + years + " years at " +rateOfInterest + "%, the investment " +
                "will be worth " + dollar + roundedAmmount +".");
    }

    public int getPrincipal() {
        System.out.println("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double getRateOfInterest() {
        System.out.println("Enter the rate of interest: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public int getYears() {
        System.out.println("Enter the number of years: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        ComputingSimpleInterest computingSimpleInterest = new ComputingSimpleInterest();
        computingSimpleInterest.start();
    }
}
