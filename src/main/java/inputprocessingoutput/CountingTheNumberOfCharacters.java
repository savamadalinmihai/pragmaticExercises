package inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

    public void count(){
        String string = getInputFromUser();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;

        }
        System.out.println("The number of characters in " + string + " is: " + count);
    }

    private String getInputFromUser() {
        System.out.println("What's your input?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        CountingTheNumberOfCharacters countingTheNumberOfCharacters = new CountingTheNumberOfCharacters();
        countingTheNumberOfCharacters.count();
    }
}

