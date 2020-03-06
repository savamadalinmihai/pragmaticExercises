package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {
    List<String> employees = new ArrayList<String>();

    public void initializeEmployees() {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }

    public void checkAndRemoveEmployee() {
        printAllEntries();

        String employeeToRemove = getEmployeeToRemove();

        if (employees.contains(employeeToRemove)) {
            employees.remove(employeeToRemove);

            // here, I create a new list, without the deleted element
            String[] arrayOfEmployeesAfterRemoval = new String[employees.size()];

            for (int i = 0; i < employees.size(); i++)
                arrayOfEmployeesAfterRemoval[i] = employees.get(i);

            System.out.println();
            System.out.println("There are now " + employees.size() + " employees:");
            System.out.println();

            for (String name : arrayOfEmployeesAfterRemoval)
                System.out.println(name + ".");
            System.out.println();
        } else {
            System.out.println("The name you entered doesn't exist.");
            checkAndRemoveEmployee();
        }

    }

    private void printAllEntries() {
        String[] arrayOfEmployees = new String[employees.size()];

        //here, I map the array with the info from the list.
        for (int i = 0; i < employees.size(); i++)
            arrayOfEmployees[i] = employees.get(i);

        System.out.println("There are " + employees.size() + " employees:");
        System.out.println();

        for (String name : arrayOfEmployees)
            System.out.println(name + ".");
        System.out.println();
    }

    public String getEmployeeToRemove() {
        System.out.println("Enter an employee name to remove:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        EmployeeListRemoval employeeListRemoval = new EmployeeListRemoval();
        employeeListRemoval.initializeEmployees();
        employeeListRemoval.checkAndRemoveEmployee();
    }
}
