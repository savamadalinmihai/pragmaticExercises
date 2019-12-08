package calculations;

import java.util.Scanner;

public class PizzaParty {
    int pizzas = getPizzas();
    int people = getPeople();
    double slices = (double) pizzas / people;
    int slice = (pizzas * 8) / people;
    int pizza = (int) slices / 8;
    double roundedSlices = Math.round(slices * 1000.0) / 1000;
    double leftovers = pizzas % people;
    int intSlices = (int) slices;
    int intLeftovers = (int) leftovers;

    private int getPizzas() {
        System.out.println("How many pizzas do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getPeople() {
        System.out.println("How many peple do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void eat() {
        if (people < 2) {
            System.out.println("So we have " + people + " person with " + pizzas + " pizza.");
        } else {
            System.out.println("So we have " + people + " people with " + pizzas + " pizzas.");
        }

        System.out.println("Each person gets " + slice + " slices of pizza.");
        if (intSlices < 2) {
            System.out.println("There are " + intLeftovers + " slices of pizza left over.");
        } else {
            System.out.println("There is " + intLeftovers + " slice of pizza left over.");
        }
    }
    public static void main (String[]args){
        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.eat();
    }
}
