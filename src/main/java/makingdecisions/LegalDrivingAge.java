package makingdecisions;

import java.util.Scanner;

public class LegalDrivingAge {
    int age = getAge();
    int legalAge;

    public void validateAge(){
        if (age <= legalAge && age >= 0){
            System.out.println("You are not old enough to legally drive.");
        }else if (age >= legalAge && age <= 100){
            System.out.println("You are old enough to legally drive!");
        }if (age >=80 && age <= 100){
            System.out.println("But while you ARE old enough to drive, I don't recommend it...");
        }
    }


    public int getAge(){
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.validateAge();

    }
}
