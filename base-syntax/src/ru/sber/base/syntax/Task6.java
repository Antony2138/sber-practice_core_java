package ru.sber.base.syntax;

// Task6 - Звездочки
public class Task6 {

    public static void main(String[] args) {
        int Rows = 5;
        int Columns = 3;

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}