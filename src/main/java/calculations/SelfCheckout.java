package calculations;

import java.util.Scanner;

public class SelfCheckout {

    int item1 = getItem1();
    int quantity1 = getQuantity1();
    int item2 = getItem2();
    int quantity2 = getQuantity2();
    int item3 = getItem3();
    int quantity3 = getQuantity3();
    double subtotal = (item1*quantity1) + (item2*quantity2) + (item3*quantity3);
    double tax = 0.055 * subtotal;
    double total = subtotal + tax;

    public void calculate(){
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);


    }

    public int getItem1(){
        System.out.println("What is the price of your first item?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getItem2(){
        System.out.println("What is the price of your second item?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getItem3(){
        System.out.println("What is the price of your third item?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getQuantity1(){
        System.out.println("Enter the quantity of item 1.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getQuantity2(){
        System.out.println("Enter the quantity of item 2.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getQuantity3(){
        System.out.println("Enter the quantity of item 3.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        SelfCheckout selfCheckout = new SelfCheckout();
        selfCheckout.calculate();
    }
}
