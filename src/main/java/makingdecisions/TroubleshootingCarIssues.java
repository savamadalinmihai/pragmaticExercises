package makingdecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    String firstQuestion = getFirstQuestion();

    public void troubleshoot() {
        if (firstQuestion.equalsIgnoreCase("Y")
                || firstQuestion.equalsIgnoreCase("Yes")) {
            String secondQuestion = getSecondQuestionYes();

            // I initiated the variable for the second question here
            // so I would only ask for second input after analysing first input.

            if (secondQuestion.equalsIgnoreCase("Y")
                    || secondQuestion.equalsIgnoreCase("Yes")) {
                System.out.println("Clean terminals and try again.");
            } else if (secondQuestion.equalsIgnoreCase("N")
                    || secondQuestion.equalsIgnoreCase("no")) {
                System.out.println("Replace cables and try again.");
            }
        } else if (firstQuestion.equalsIgnoreCase("N")
                || firstQuestion.equalsIgnoreCase("No")){
            System.out.println("Does the car make a clicking noise?");

        }
    }




    public String getFirstQuestion(){
        System.out.println("Is the car silent when you turn the key?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getSecondQuestionYes(){
        System.out.println("Are the battery terminals corroded?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        TroubleshootingCarIssues troubleshootingCarIssues = new TroubleshootingCarIssues();
        troubleshootingCarIssues.troubleshoot();
    }
}
