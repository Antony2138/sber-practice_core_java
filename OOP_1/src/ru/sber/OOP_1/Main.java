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
        System.out.println(Circle);
    }

    private static void MatrixDemonstration() {
        final int BASE_ROW_COUNT = 5;
        final int BASE_COLUMN_COUNT = 5;
        final int ADDITION_ROW_COUNT = 3;
        final int ADDITION_COLUMN_COUNT = 2;
        int counter = 0;

        Matrix baseMatrix = new Matrix(BASE_ROW_COUNT, BASE_COLUMN_COUNT);
        for (int i = 0; i < BASE_ROW_COUNT; i++) {
            for (int j = 0; j < BASE_COLUMN_COUNT; j++) {
                baseMatrix.setValue(i, j, counter++);
            }
        }

        baseMatrix.print();
//        System.out.println(baseMatrix);

        Matrix additionMatrix = new Matrix(ADDITION_ROW_COUNT, ADDITION_COLUMN_COUNT);
        for (int i = 0; i < ADDITION_ROW_COUNT; i++) {
            for (int j = 0; j < ADDITION_COLUMN_COUNT; j++) {
                additionMatrix.setValue(i, j, counter--);
            }
        }

        baseMatrix
                .add(additionMatrix)
                .print();

        Matrix multiplyMatrix = new Matrix(9, 6);
        for (int i = 0; i < multiplyMatrix.rowCount; i++) {
            for (int j = 0; j < multiplyMatrix.columnCount; j++) {
                multiplyMatrix.setValue(i, j, --counter);
            }
        }

        multiplyMatrix.print();
        baseMatrix.multiply(multiplyMatrix).print();
    }

    private static void BookDemonstration(){
        Author danzel = new Author("Дензел Вашингтон", "Мужчина", "askyourans@mail.com");
        Book alice = new Book("Почта России", danzel, 1365);

        System.out.println(danzel);
        System.out.println(alice);

        Author annaSemenovich = new Author("Анна Семенович", "Женщина", null);
        annaSemenovich.setEmail("askyourans@mail.com");

        Book cleanCode = new Book("Год века", annaSemenovich, 2016);
        cleanCode.setYear(200);

        System.out.println(annaSemenovich);
        System.out.println(cleanCode);
    }


    public static void main(String[] args) {
        PhoneDemonstration();
        System.out.println();

        CircleDemonstration();
        System.out.println();

        MatrixDemonstration();
        System.out.println();

        BookDemonstration();
        System.out.println();
    }
}
