package makingdecisions;

import java.util.Scanner;

public class TemperatureConverter {
    String convertFromTo = getConvertFromTo();

    public void deciderMethod() {
        if (convertFromTo.equals("C")) {
            convertFromTo = convertFromTo.toLowerCase();
        }if (convertFromTo.equals("c")){
            fahrenheitToCelsius();
        }if (convertFromTo.equals("F")){
            convertFromTo = convertFromTo.toLowerCase();
            if(convertFromTo.equals("f")){
                celsiusToFahrenheit();
            }
        }
    }

    public void celsiusToFahrenheit() {
        System.out.println("Your choice: F.");
        System.out.println("");
        double celsiusInput = getCelsiusInput();
        double celsiusToFahrenheit = (celsiusInput * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + celsiusToFahrenheit);
    }

    public void fahrenheitToCelsius() {
        System.out.println("Your choice: C.");
        System.out.println("");
        double fahrenheitInput = getFahrenheitInput();
        double fahrenheitToCelsius = (fahrenheitInput - 32) * (5 / 9);
        System.out.println("The temperature in Celsius is " + fahrenheitToCelsius);
    }

    public String getConvertFromTo() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double getCelsiusInput() {
        System.out.println("Please enter the temperature in Celsius.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public double getFahrenheitInput() {
        System.out.println("Please enter the temperature in Fahrenheit.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.deciderMethod();
    }
}
