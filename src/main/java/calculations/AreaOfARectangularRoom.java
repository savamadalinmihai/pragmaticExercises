package calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {
    int lengthInFeet = getLengthInFeet();
    int widthInFeet = getWidthInFeet();
    ;
    int area = lengthInFeet * widthInFeet;
    double areaInMeters = area * 0.09290304;
    double roundedAreaInMeters = Math.round(areaInMeters * 1000.0) / 1000.0;

    public void calculateArea() {
        System.out.println("You entered dimensions of " + lengthInFeet + " feet by " + widthInFeet + " feet.");
        System.out.println("The area in feet is " + area);
        System.out.println("The area in meters is " + roundedAreaInMeters);

    }


    private int getLengthInFeet() {
        System.out.println("Please enter the length in feet: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getWidthInFeet() {
        System.out.println("Please enter the width in feet: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        AreaOfARectangularRoom areaOfARectangularRoom = new AreaOfARectangularRoom();
        areaOfARectangularRoom.calculateArea();
    }
}
