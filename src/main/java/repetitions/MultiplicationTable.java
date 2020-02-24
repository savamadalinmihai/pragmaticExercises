package repetitions;

public class MultiplicationTable {
    int column;
    int row;

    public void generateTable() {
        for (column = 1; column <= 12; column++) {
            for (row = 1; row <= 12; row++) {
                System.out.print(column * row + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.generateTable();
    }
}
