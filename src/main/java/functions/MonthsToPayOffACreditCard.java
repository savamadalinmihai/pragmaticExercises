package functions;

import java.util.Scanner;

public class MonthsToPayOffACreditCard {
    double balance = balance();
    double apr = (apr()/100);
    double monthlyPayment = monthlyPayment();


    public void calculateMonthsUntilPaidOff(){
        double dailyRate = (apr/365);
        double numberOfMonths = (-(1.0/30)) * ((Math.log(1 + (balance/monthlyPayment *
                (1 - (Math.pow((1 + dailyRate), 30))))))/Math.log(1 + dailyRate));
        int roundedMonths = (int) Math.ceil(numberOfMonths);


        System.out.println("It will take you " + roundedMonths + " months to pay off this card.");
    }

    public double balance() {
        System.out.println("What is your balance?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public double apr() {
        System.out.println("What is the APR on the card (as a percent)?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public double monthlyPayment() {
        System.out.println("What is the monthly payment you can make?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        MonthsToPayOffACreditCard monthsToPayOffACreditCard = new MonthsToPayOffACreditCard();
        monthsToPayOffACreditCard.calculateMonthsUntilPaidOff();
    }
}
