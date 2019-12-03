package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

    public void sayHello(){

        String name = userName();

        System.out.println("Hi, " + name + "," + " nice to meet you.");

    }

    private String userName(){
        System.out.println("Hi, what's your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static void main(String[] args) {

        SayingHello sayingHello = new SayingHello();
        sayingHello.sayHello();

    }
}
