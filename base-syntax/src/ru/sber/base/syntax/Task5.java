package ru.sber.base.syntax;

public class Task5 {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (if_Prostoe(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
    public static boolean if_Prostoe(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

