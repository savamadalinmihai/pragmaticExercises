package functions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public void isAnagram() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String firstWord = getInput1().replaceAll("\\s", "");
        String secondWord = getInput2().replaceAll("\\s", "");
        boolean status = true;
        if (firstWord.length() != secondWord.length()) {
            System.out.println("The two words you entered are of different length. Please type again.");
            status = false;
            isAnagram();
        } else {
            char[] ArrayS1 = firstWord.toLowerCase().toCharArray();
            char[] ArrayS2 = secondWord.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
            if (status) {
                System.out.println("\"" + firstWord + "\"" + " and " + "\"" + secondWord + "\"" + " are anagrams.");
            } else {
                System.out.println("\"" + firstWord + "\"" + " and " + "\"" + secondWord + "\"" + " are not anagrams.");
            }
        }
    }

    private String getInput1() {
        System.out.println("Enter your first word:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getInput2() {
        System.out.println("Enter your second word:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        anagramChecker.isAnagram();
    }
}
