package ru.sber.OOP_1;

import java.awt.*;

public class Main {

    private static void PhoneDemonstration() {
        Phone phone = new Phone();

        phone.receiveCall("Вася Пупкин");
        phone.sendMessage(new String[] { "900", "88005553535", "0004", "119" });

        Phone sberPhone = new Phone( "900", "Samsung X600", 123);
        Phone actualPhone = new Phone("88005553535", "Nokia 3310", 133);

        sberPhone.receiveCall("Реклама", "88005553535");
        System.out.println(actualPhone.getNumber());
    }

    private static void CircleDemonstration() {
        Circle Circle = new Circle(Math.random() * 69, new Color(123, 97, 61));

        System.out.format("Площадь круга: %f\n", Circle.area());
        System.out.format("Периметр круга: %f\n", Circle.perimeter());

        // Метод toString применяет округление до 3 чисел после запятой для площади и периметра
        System.out.println(Circle);
    }

    public static void main(String[] args) {
        PhoneDemonstration();
        System.out.println();

        CircleDemonstration();
        System.out.println();
    }
}
