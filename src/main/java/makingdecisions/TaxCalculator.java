package makingdecisions;

import java.util.Scanner;

public class TaxCalculator {
    char dollar = '$';
    double amount = getAmount();
    String state = getState();
    double simpleTotal = Math.round(amount * 100.0) / 100.0;
    double wisconsinTax = Math.round((5.5/100) * simpleTotal * 100.0) / 100.0;
    double total = Math.round((simpleTotal + wisconsinTax) * 100.0) / 100.0;


    public void calculateTax(){
        if (state.equals("WI")) {
            System.out.println("The subtotal is " + dollar + simpleTotal);
            System.out.println("The tax is " + dollar + wisconsinTax);
            System.out.println("The total is " + dollar + total);
        }else{
            System.out.println("The total is " + dollar + simpleTotal);
        }

    }

    public double getAmount() {
        System.out.println("What is the amount?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public String getState() {
        System.out.println("What is the state?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax();
    }
}
