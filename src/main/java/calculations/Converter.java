package calculations;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Converter {
    double ammountInEuros = getAmmountInEuros();
    double rate = getRate();
    double ammountInDollars = ammountInEuros * rate;
    double roundedAmmountInDollars = ammountInDollars/100;

    public void calculate (){
        System.out.println(ammountInEuros + " euros at the exchange rate of " + rate + " is:");

        System.out.println(new DecimalFormat("0.00").format(roundedAmmountInDollars) + " U.S. dollars.");
    }

    public double getAmmountInEuros() {
        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public double getRate() {
        System.out.println("What's the exchange rate?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Converter currencyConverter = new Converter();
        currencyConverter.calculate();
    }
}
