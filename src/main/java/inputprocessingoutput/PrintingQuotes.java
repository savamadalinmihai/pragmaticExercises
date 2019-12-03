package inputprocessingoutput;

import java.util.Scanner;

public class PrintingQuotes {

    String quote = getQuoteFromUser();
    String author = getAuthorFromUser();

    public void addQuotes (){
        System.out.println(author + " says \"" + quote + "\"");
    }

    private String getQuoteFromUser(){
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getAuthorFromUser(){
        System.out.println("Who said it?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }


    public static void main(String[] args) {
        PrintingQuotes printingQuotes = new PrintingQuotes();
        printingQuotes.addQuotes();
    }
}
