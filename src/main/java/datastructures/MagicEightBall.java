package datastructures;

import java.util.*;

public class MagicEightBall {
    Random random = new Random();
    int guesser = random.nextInt(4);

    List<String> answers = Arrays.asList("Yes.", "No.", "Maybe.", "Ask again later.");

    public void guess(){
        getInput();
        System.out.println(answers.get(guesser));
    }

    public String getInput(){
        System.out.println("What's your question?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        MagicEightBall magicEightBall = new MagicEightBall();
        magicEightBall.guess();

    }
}
