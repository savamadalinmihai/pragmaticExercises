package datastructures;

import java.util.*;

public class PasswordGenerator {
    Random random = new Random();
    int length = getLength();
    int specialCharacters = getSpecialCharacters();
    int numbers = getNumbers();
    int lengthOfStringPortionOfPassword = length - specialCharacters - numbers;
    int[] numbersInPassword = new int[numbers];
    List<String> passwordCharacters = new ArrayList<String>();
    StringBuilder stringOfAllNumbers = new StringBuilder();
    StringBuilder stringOfAllLetters = new StringBuilder();
    StringBuilder stringOfAllCharacters = new StringBuilder();
    StringBuilder passwordThatHasToBeShuffled = new StringBuilder();
    String shuffledPassword = String.valueOf(passwordThatHasToBeShuffled);
    String passwordForPrinting;

    public void generateNumbersInPassword() {
        for (int i = 0; i < numbers; i++) {
            int number = random.nextInt(9);
            numbersInPassword[i] = number;
        }

        for (int i = 0; i < numbersInPassword.length; i++) {
            stringOfAllNumbers.append(numbersInPassword[i]);
        }
    }

    public void generateLettersInPassword() {
        String abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        for (int i = 0; i < lengthOfStringPortionOfPassword; i++) {
            char letter = abc.charAt(random.nextInt(abc.length()));
            stringOfAllLetters.append(letter);
        }
    }

    public void generateSpecialCharactersInPassword() {
        for (int i = 0; i < specialCharacters; i++) {
            stringOfAllCharacters.append(passwordCharacters.get(i));
        }
    }

    public void shufflePassword(){
        List<Character> list = new ArrayList<Character>();
        char[] charArray = shuffledPassword.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];
            list.add(letter);
        }
        Collections.shuffle(list);
        StringBuilder shuffler = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char letter = list.get(i);
            shuffler.append(letter);
        }
        passwordForPrinting = shuffler.toString();
    }

    public void generateCompletePassword() {
        initialiseList();
        generateNumbersInPassword();
        generateLettersInPassword();
        generateSpecialCharactersInPassword();

        passwordThatHasToBeShuffled.append(stringOfAllNumbers);
        passwordThatHasToBeShuffled.append(stringOfAllLetters);
        passwordThatHasToBeShuffled.append(stringOfAllCharacters);

        shufflePassword();

        System.out.println("Your password is: " + passwordForPrinting);
    }


    public void initialiseList() {
        passwordCharacters.add("!");
        passwordCharacters.add("@");
        passwordCharacters.add("#");
        passwordCharacters.add("$");
        passwordCharacters.add("%");
        passwordCharacters.add("^");
        passwordCharacters.add("&");
        passwordCharacters.add("*");
    }

    public int getLength() {
        try {
            System.out.println("What's the minimum length?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only specify this in numbers.");
        }
        return getLength();
    }

    public int getSpecialCharacters() {
        try {
            System.out.println("How many special characters?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only specify this in numbers.");
        }
        return getSpecialCharacters();
    }

    public int getNumbers() {
        try {
            System.out.println("How many numbers?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only specify this in numbers.");
        }
        return getNumbers();
    }

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.generateCompletePassword();
    }
}
