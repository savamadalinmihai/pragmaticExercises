package datastructures;

import java.util.*;

public class PickingAWinner {
    Random random = new Random();
    String userInput = getInput();
    List<String> participants = new ArrayList<>();

    public void verifyInput() {
        while (!userInput.isEmpty()) {
            participants.add(userInput);
            userInput = getInput();
        }
        int randomNumber = random.nextInt(participants.size());
        System.out.println("The winner is: " + participants.get(randomNumber) + ".");
    }


    public String getInput() {
        System.out.println("Enter a name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        PickingAWinner pickingAWinner = new PickingAWinner();
        pickingAWinner.verifyInput();
    }
}
