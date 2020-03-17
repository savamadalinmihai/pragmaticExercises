package datastructures;

import java.time.LocalDate;
import java.util.*;

public class FilteringRecords {

    Map<String, Object> row1 = new LinkedHashMap<>();
    Map<String, Object> row2 = new LinkedHashMap<>();
    Map<String, Object> row3 = new LinkedHashMap<>();
    Map<String, Object> row4 = new LinkedHashMap<>();
    Map<String, Object> row5 = new LinkedHashMap<>();
    Map<String, Object> row6 = new LinkedHashMap<>();
    List<Map<String, Object>> rowsList = new ArrayList<>();
    String input = getInput();

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
        row4.put("separation_date", "");

        row5.put("first_name", "Jaquelin");
        row5.put("last_name", "Jackson");
        row5.put("position", "DBA");
        row5.put("separation_date", "");

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

    public void filterRecords() {
        initialiseDataSet();
        rowsList.sort(Comparator.comparing(rowsList -> rowsList.get("last_name").toString()));

        System.out.println("Results:");
        System.out.println("Name                 | Position             | Separation Date      |");
        System.out.println("-------------------------------------------------------------------");
        for (Map<String, Object> map : rowsList) {
            Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
            if (iterator.next().toString().contains(input)) {
                iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Object> currentMapEntry = iterator.next();
                    if (currentMapEntry.getKey().equals("first_name")) {
                        currentMapEntry.setValue(currentMapEntry.getValue().toString() + " " +
                                iterator.next().getValue().toString());
                    }
                    System.out.format("%-21s| ", currentMapEntry.getValue());
                }
            }
            if (rowsList.toString().contains(input)){
//                    map.entrySet().contains(input))
                System.out.println();
            }
        }
    }

    public String getInput() {
        System.out.println("Enter a search string:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        FilteringRecords filteringRecords = new FilteringRecords();
        filteringRecords.filterRecords();
    }
}
