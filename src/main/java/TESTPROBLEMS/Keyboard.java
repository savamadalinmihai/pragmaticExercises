package TESTPROBLEMS;

import java.util.ArrayList;
import java.util.List;

public class Keyboard {
    public int calculateTime(String pass, String keyboard) {
        ArrayList<Integer> index_i = new ArrayList<Integer>();
        ArrayList<Integer> index_j = new ArrayList<Integer>();
        int[][] matrix = new int[3][3];
        int time = 0, p = 0, num, cat, rest;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                System.out.println("board[" + i + "]" + "[" + j + "]" + ": " +
//                        Character.getNumericValue(keyboard.charAt(p)));
                matrix[i][j] = Character.getNumericValue(keyboard.charAt(p));
                p++;
            }
        }

        for (int c = 0; c < pass.length(); c++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (Character.getNumericValue(pass.charAt(c)) == matrix[i][j]) {
                        System.out.println("Ole, position:" + i + j);
                        index_i.add(i);
                        index_j.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < (index_i.size() - 1); i++) {
            num = (index_i.get(i) - index_i.get(i + 1)) + (index_j.get(i) - index_j.get(i + 1));
            System.out.println(num);
            if (Math.abs(num) >= 2) {
                cat = Math.abs(num) / 2;
                rest = Math.abs(num) % 2;
                System.out.println("Cat: " + cat);
                System.out.println("Rest: " + rest);
                time += cat + rest;
            } else {
                time += Math.abs(num);
            }
        }
        System.out.println("Time: " + time);
        return time;
    }

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.calculateTime("5193", "123756489");
    }
}
