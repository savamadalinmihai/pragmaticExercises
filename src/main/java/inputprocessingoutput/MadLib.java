package inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    String noun = getNoun();
    String verb = getVerb();
    String adjective = getAdjective();
    String adverb = getAdverb();

    public void makePoetry(){
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");


    }

    private String getNoun(){
        System.out.println("Tell me a noun: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getVerb(){
        System.out.println("Tell me a verb: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getAdjective(){
        System.out.println("Tell me an adjective: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getAdverb(){
        System.out.println("Tell me an adverb: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        madLib.makePoetry();

    }
}
