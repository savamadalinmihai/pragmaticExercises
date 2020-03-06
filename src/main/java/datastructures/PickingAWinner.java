package datastructures;

import java.util.*;

public class PickingAWinner {
    Random random = new Random();
    List<String> participants = new ArrayList<>();

    public void checkForInput() {
        while (getInput() != null) {
            String userInput = getInput();
            participants.add(userInput);
        }
        int randomNumber = random.nextInt(participants.size());
        System.out.println("The winner is " + participants.get(randomNumber));
    }


    public String getInput() {
        System.out.println("Enter a name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        PickingAWinner pickingAWinner = new PickingAWinner();
        pickingAWinner.checkForInput();
    }
}
