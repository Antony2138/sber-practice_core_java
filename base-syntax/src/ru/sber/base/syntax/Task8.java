package ru.sber.base.syntax;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("|   Что это такое: синий, большой, с усами и полностью набит зайцами?   |");
        System.out.println("|                 У вас есть 3 попытки для ответа.                      |");
        System.out.println("| Каждое слово, введенное вами, считается за ответ, кроме слова \"Сдаюсь\"|");
        System.out.println("|          При вводе этого слова, вам будет выведен ответ.              |");
        System.out.println();
        System.out.println("Введите ваш ответ:");

        int Tries = 3;
        Scanner scanner = new Scanner(System.in);

        while (Tries > 0){
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "троллейбус" -> {
                    System.out.println("Правильно!");
                    return;
                }
                case "сдаюсь" -> {
                    System.out.println("Правильный ответ: Троллейбус");
                    return;
                }
                default -> {
                    System.out.println("Подумай ещё");
                    Tries--;
                }
            }
        }

        System.out.println();
    }

}


