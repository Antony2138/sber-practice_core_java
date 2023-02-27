package ru.sber.OOP_1;

import java.awt.*;

public class Circle {

    private Double radius;

    private String color;


    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(Double radius, Color color) {
        this.radius = radius;
        this.color = String.valueOf(color);

    }
    public String toString() {
        return String.format("{ Радиус: %.3f; Цвет: %s; Площадь: %.3f; Периметр: %.3f }", radius, color, area(), perimeter());
    }
}
