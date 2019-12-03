package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    String value1String = getValue1String();
    int value1 = Integer.parseInt(value1String);
    String value2String = getValue2String();
    int value2 = Integer.parseInt(value2String);

    int sum = value1 + value2;
    int substraction = value1 - value2;
    int division = value1 / value2;
    int multiplication = value1 * value2;


    public void calculate(){


        System.out.println(value1 + " + " + value2 + " = " + sum);
        System.out.println(value1 + " - " + value2 + " = " + substraction);
        System.out.println(value1 + " / " + value2 + " = " + division);
        System.out.println(value1 + " * " + value2 + " = " + multiplication);

    }

    private String getValue1String() {
        System.out.println("What is the first number?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getValue2String(){
        System.out.println("What is the second number?");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }


    public static void main(String[] args) {
        SimpleMath simplemath = new SimpleMath();
        simplemath.calculate();
    }
}
