package calculations;

import java.util.Scanner;

public class PaintCalculator {
    int lengthInMeters = getLengthInMeters();
    int widthInMeters = getWidthInMeters();;
    int area = lengthInMeters * widthInMeters;
    double litersOfPaint = area / 10;
    double roundedLitersOfPaint = Math.round(litersOfPaint + 0.5);


    public void calculateGallons(){
        System.out.println("You entered dimensions of " + lengthInMeters + " by " + widthInMeters + " meters.");
        System.out.println("The area in square meters is " + area);
        System.out.println("This means you will be needing " + roundedLitersOfPaint + " liters of paint.");

    }

    private int getLengthInMeters(){
        System.out.println("Please enter the length in meters: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private int getWidthInMeters(){
        System.out.println("Please enter the width in meters: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.calculateGallons();
    }
}
