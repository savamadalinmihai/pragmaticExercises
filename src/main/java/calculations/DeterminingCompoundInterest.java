package calculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeterminingCompoundInterest {
    int principal = getPrincipal();
    double rateOfInterest = getRateOfInterest();
    double rateForCalculations = rateOfInterest/100;
    int years = getYears();
    int compound = getCompound();
    double exponent = compound*years;
    double ammountAfterInvestment = principal * Math.pow((1+rateForCalculations/compound), exponent);

    public void start(){
        System.out.println("$" + principal + " invested at " + rateOfInterest + "% for " +
                years + " years compounded " + compound + " times per year is: " + "$" +
                new DecimalFormat("0.00").format(ammountAfterInvestment) + ".");
    }

    public int getPrincipal() {
        System.out.println("What is the principal ammount?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double getRateOfInterest() {
        System.out.println("What is the rate of interest?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public int getYears() {
        System.out.println("What is the number of years?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getCompound() {
        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        DeterminingCompoundInterest determiningCompoundInterest = new DeterminingCompoundInterest();
        determiningCompoundInterest.start();
    }
}
