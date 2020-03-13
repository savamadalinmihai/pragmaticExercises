package datastructures;

import java.time.LocalDate;
import java.util.*;

public class SortingRecords {
    Map<String, Object> row1 = new HashMap<>();
    Map<String, Object> row2 = new HashMap<>();
    Map<String, Object> row3 = new HashMap<>();
    Map<String, Object> row4 = new HashMap<>();
    Map<String, Object> row5 = new HashMap<>();
    Map<String, Object> row6 = new HashMap<>();
    List<Map<String, Object>> rowsList = new ArrayList<>();
    StringBuilder completeName = new StringBuilder();

    public void initialiseDataSet() {

        row1.put("first_name", "John");
        row1.put("last_name", "Johnson");
        row1.put("position", "Manager");
        row1.put("separation_date", LocalDate.of(2016, 12, 31));

        row2.put("first_name", "Tou");
        row2.put("last_name", "Xiong");
        row2.put("position", "Software Engineer");
        row2.put("separation_date", LocalDate.of(2016, 10, 5));

        row3.put("first_name", "Michaela");
        row3.put("last_name", "Michaelson");
        row3.put("position", "District Manager");
        row3.put("separation_date", LocalDate.of(2015, 12, 19));

        row4.put("first_name", "Jake");
        row4.put("last_name", "Jacobson");
        row4.put("position", "Programmer");
        row4.put("separation_date", null);

        row5.put("first_name", "Jaquelin");
        row5.put("last_name", "Jackson");
        row5.put("position", "DBA");
        row5.put("separation_date", null);

        row6.put("first_name", "Sally");
        row6.put("last_name", "Weber");
        row6.put("position", "Web Developer");
        row6.put("separation_date", LocalDate.of(2015, 12, 18));

        rowsList.add(row1);
        rowsList.add(row2);
        rowsList.add(row3);
        rowsList.add(row4);
        rowsList.add(row5);
        rowsList.add(row6);
    }

    public void sortRecords() {
        rowsList.sort(Comparator.comparing(rowsList -> rowsList.get("last_name").toString()));

        System.out.println("Name " + "\t| Position" + "\t| Separation Date ");
        for (int i = 1; i <= rowsList.size(); i++) {
            System.out.println(rowsList.listIterator(i) + "\t");
        }
        System.out.println(rowsList.listIterator().toString()  + "\t");
    }

    public static void main(String[] args) {
        SortingRecords sortingRecords = new SortingRecords();
        sortingRecords.sortRecords();
    }
}
