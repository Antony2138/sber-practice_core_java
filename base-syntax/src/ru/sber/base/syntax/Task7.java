package ru.sber.base.syntax;

// Task7 - Числа Фибоначчи
public class Task7 {

    public static void main(String[] args) {
        int first_one = 0;
        int second_one = 1;

        for (int i = 1; i <= 11; i++) {
            int newNumber = first_one + second_one;
            first_one = second_one;
            second_one = newNumber;

            System.out.printf("%d ", newNumber);
        }
    }
}