package calculations;

import java.util.Scanner;

public class PaintCalculator {
    int lengthInFeet = getLengthInFeet();
    int widthInFeet = getWidthInFeet();;
    int area = lengthInFeet * widthInFeet;
    double gallonsOfPaint = area / 350;
    double roundedGallonsOfPaint = Math.round(gallonsOfPaint + 0.5);


    public void calculateGallons(){
        System.out.println("You entered dimensions of " + lengthInFeet + " feet by " + widthInFeet + " feet.");
        System.out.println("The area in feet is " + area);
        System.out.println("This means you will be needing " + roundedGallonsOfPaint + " gallons of paint.");

    }

    private int getLengthInFeet(){
        System.out.println("Please enter the length in feet: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private int getWidthInFeet(){
        System.out.println("Please enter the width in feet: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.calculateGallons();
    }
}
