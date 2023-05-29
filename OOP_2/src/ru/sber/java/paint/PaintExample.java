package ru.sber.java.paint;

public class PaintExample {
    public static void main(String[] args) {
        Circle circle = new Circle(13,43,9,5);
        FigureUtil.draw(circle, Figure.Color.GREEN);
        FigureUtil.draw(circle, Figure.Color.BLUE);
        FigureUtil.draw(circle);
        Square square = new Square(44,1,5,1);
        FigureUtil.draw(square);
        Triangle trrr = new Triangle(160,30,12,43);
        FigureUtil.draw(trrr, Figure.Color.RED);
    }
}
