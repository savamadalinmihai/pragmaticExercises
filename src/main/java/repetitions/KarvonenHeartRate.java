package repetitions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KarvonenHeartRate {
    int restingPulse = getRestingPulse();
    int age = getAge();


    public void calculate(){
        System.out.println("Resting pulse: " + restingPulse + "     Age:" + age);
        System.out.println();
        System.out.println("Intensity: " + "\t| Rate:");
        for (int intensity = 55; intensity <= 95; intensity+=5) {
            int targetHeartRate = (((220 - age) - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity + "%" + "\t        | " + targetHeartRate + " \tbpm");
        }
    }

    public int getAge() {
        System.out.println("What is your age?");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only use numbers!");
            System.out.println();
            return getAge();
        }
    }

    public int getRestingPulse() {
        System.out.println("What is your resting pulse?");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only use numbers!");
            System.out.println();
            return getRestingPulse();
        }
    }


    public static void main(String[] args) {
        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        karvonenHeartRate.calculate();
    }
}
