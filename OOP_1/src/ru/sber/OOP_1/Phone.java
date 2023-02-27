package ru.sber.OOP_1;

public class Phone {
    private String number = "";

    private String model = "";

    private int weight = 0;

    public void receiveCall(String name) {
        System.out.format("Звонит %s\n", name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {}

    public void receiveCall(String name, String number) {
        System.out.format("Звонит %s %s\n", name, number);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers) {
            System.out.format("%s\n", number);
        }
    }

    public String toString() {
        return String.format("{ Номер: %s; Модель: %s; Вес: %d }", number, model, weight);
    }




}
