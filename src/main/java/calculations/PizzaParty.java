package calculations;

import java.util.Scanner;

public class PizzaParty {
    int pizzas = getPizzas();
    int people = getPeople();
    double slices = pizzas / people;
    double leftovers = pizzas % people;

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
            System.out.println("So we have " + people + " person with " + pizzas + " pizzas.");
        } else {
            System.out.println("So we have " + people + " people with " + pizzas + " pizzas.");
        }

        System.out.println("Each person gets " + slices + " pieces of pizza.");
        if (slices < 2) {
            System.out.println("There is " + leftovers + " piece of pizza left over.");
        } else {
            System.out.println("There are " + leftovers + " pieces of pizza left over.");
        }
    }
    public static void main (String[]args){
        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.eat();
    }
}
