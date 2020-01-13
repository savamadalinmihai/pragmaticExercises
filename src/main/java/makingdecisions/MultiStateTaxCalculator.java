package makingdecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiStateTaxCalculator {
    char dollar = '$';
    double amount = getAmount();
    String state = getState();
    double simpleTotal = Math.round(amount * 100.0) / 100.0;
    double wisconsinTax = Math.round(0.05 * simpleTotal * 100.0) / 100.0;
    double total = Math.round((simpleTotal + wisconsinTax) * 100.0) / 100.0;
    double eauClaireTax = wisconsinTax + 0.005;
    double eauClaireTotal = total + 0.005;
    double dunnTax = wisconsinTax + 0.004;
    double dunnTotal = total + 0.004;
    double illinoisTax = Math.round((0.08 * amount) * 100.0) / 100.0;
    double illinoisTotal = Math.round((simpleTotal + illinoisTax) * 100.0) / 100.0;

    public void decideBetweenCounties() {
        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            calculateWisconsinTax();
        } else if (state.equalsIgnoreCase("Il") || state.equalsIgnoreCase("Illy")
                || state.equalsIgnoreCase("Illinois")) {
            calculateIllinousTax();
        } else calculateSimpleTax();
    }

    public void calculateWisconsinTax() {
        String county = getCounty();
        if (county.equalsIgnoreCase("Eau") || county.equalsIgnoreCase("EC")
                || county.equalsIgnoreCase("Eau Claire")) {
            System.out.println("You chose Eau Claire county.");
            System.out.println("The subtotal is " + dollar + simpleTotal);
            System.out.println("The tax is " + dollar + eauClaireTax);
            System.out.println("The total is " + dollar + eauClaireTotal);
            return;
        } else if (county.equalsIgnoreCase("D") || county.equalsIgnoreCase("Dunn")
                || county.equalsIgnoreCase("Du")) {
            System.out.println("You chose Dunn county.");
            System.out.println("The subtotal is " + dollar + simpleTotal);
            System.out.println("The tax is " + dollar + dunnTax);
            System.out.println("The total is " + dollar + dunnTotal);
        } else {
            System.out.println("You chose the state of Wisconsin.");
            System.out.println("The subtotal is " + dollar + simpleTotal);
            System.out.println("The tax is " + dollar + wisconsinTax);
            System.out.println("The total is " + dollar + total);
        }
    }

    public void calculateIllinousTax() {
        System.out.println("You chose Illinois.");
        System.out.println("The subtotal is " + dollar + simpleTotal);
        System.out.println("The tax is " + dollar + illinoisTax);
        System.out.println("The total is " + dollar + illinoisTotal);
    }

    public void calculateSimpleTax() {
        System.out.println("Your state has no tax.");
        System.out.println("The subtotal is " + dollar + simpleTotal);
        System.out.println("The total is " + dollar + simpleTotal);
    }


    public double getAmount() {
        try {
            System.out.println("What is the order amount?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Only numeric input is allowed!");
        }
        return getAmount();
    }

    public String getState() {
        System.out.println("What state do you live in?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String getCounty() {
        System.out.println("What county do you live in?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        MultiStateTaxCalculator multiStateTaxCalculator = new MultiStateTaxCalculator();
        multiStateTaxCalculator.decideBetweenCounties();
    }
}
