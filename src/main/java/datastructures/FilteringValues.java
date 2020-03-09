package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class FilteringValues {
    String inputToSplit = getNumbers();
    String[] temporaryArray;
    int[] arrayForFiltration;
    StringBuilder stringForPrinting = new StringBuilder();


    public void initialiseAndSplitArray() {
        String delimiter = " ";
        temporaryArray = inputToSplit.split(delimiter);
        arrayForFiltration = new int[temporaryArray.length];
        for (int i = 0; i < temporaryArray.length; i++){
            arrayForFiltration[i] = Integer.parseInt(temporaryArray[i]);
        }
        filterEvenNumbers(arrayForFiltration);
    }

    public void filterEvenNumbers(int[] arrayForFiltration){
        for (int i = 0; i < temporaryArray.length; i++){
            if (arrayForFiltration[i] % 2 == 0){
                stringForPrinting.append(arrayForFiltration[i]).append(" ");
            }

        }
        System.out.println("The even numbers are: " + stringForPrinting);
    }


    public String getNumbers() {
        System.out.println("Enter a list of numbers, separated by spaces:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        FilteringValues filteringValues = new FilteringValues();
        filteringValues.initialiseAndSplitArray();
    }
}
