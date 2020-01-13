package makingdecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    String firstQuestion = getFirstQuestion();

    public void troubleshoot() {
        if (firstQuestion.equalsIgnoreCase("Y")
                || firstQuestion.equalsIgnoreCase("Yes")) {
            String secondQuestionYes = getSecondQuestionYes();

            // I initiated the variable for the second question here
            // so I would only ask for second input after analysing first input.

            if (secondQuestionYes.equalsIgnoreCase("Y")
                    || secondQuestionYes.equalsIgnoreCase("Yes")) {
                System.out.println("Clean terminals and try again.");
            } else if (secondQuestionYes.equalsIgnoreCase("N")
                    || secondQuestionYes.equalsIgnoreCase("no")) {
                System.out.println("Replace cables and try again.");
            }
        } else if (firstQuestion.equalsIgnoreCase("N")
                || firstQuestion.equalsIgnoreCase("No")){
            String secondQuestionNo = getSecondQuestionNo();

            // I initialize this variable to go down the no path.
            // Again. I do it here to only ask the user for this input if he goes down this path.

            if (secondQuestionNo.equalsIgnoreCase("Y")
                    || secondQuestionNo.equalsIgnoreCase("Yes")){
                System.out.println("Replace the battery.");
            } else if (secondQuestionNo.equalsIgnoreCase("N")
                    || secondQuestionNo.equalsIgnoreCase("No")){
                String thirdQuestion = getThirdQuestion();

                // With this I go further down the no path.

                if (thirdQuestion.equalsIgnoreCase("y")
                        || thirdQuestion.equalsIgnoreCase("Yes")){
                    System.out.println("Check spark plug connections.");
                } else if (thirdQuestion.equalsIgnoreCase("N")
                        || thirdQuestion.equalsIgnoreCase("No")){
                    String thirdQuestionNo = getThirdQuestionNo();

                    // Again, further down the no path.

                    if (thirdQuestionNo.equalsIgnoreCase("Y")
                            || thirdQuestionNo.equalsIgnoreCase("Yes")){
                        String fourthQuestion = getFourthQuestion();

                        // This time, the only outcome is yes, so only going to yes path.

                        if (fourthQuestion.equalsIgnoreCase("Y")
                                || fourthQuestion.equalsIgnoreCase("Yes")){
                            System.out.println("Get it in for service!");
                        } else if (fourthQuestion.equalsIgnoreCase("N")
                                || fourthQuestion.equalsIgnoreCase("No")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("The option you chose doesn't exist. Please restart the troubleshooter");
                    }
                }
            }
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
    public String getSecondQuestionNo(){
        System.out.println("Does the car make a clicking noise?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getThirdQuestion(){
        System.out.println("Does the car crank up but fail to start?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getThirdQuestionNo(){
        System.out.println("Does the engine start and then die?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getFourthQuestion(){
        System.out.println("Does your car have fuel injection?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        TroubleshootingCarIssues troubleshootingCarIssues = new TroubleshootingCarIssues();
        troubleshootingCarIssues.troubleshoot();
    }
}
