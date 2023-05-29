package ru.sber.java.paint;

public class FigureUtil {
    private FigureUtil(){
    }
    public static double area(Figure figure){
        double s = figure.area();
        return s;
    }
    public static double perimetr(Figure figure){
        double p = figure.perimetr();
        return p;
    }
    public static void draw(Figure figure) {
        if (figure instanceof Drawable) {
            Drawable d = (Drawable) figure;
            String s = d.draw();
            System.out.println(s);
        } else {
            System.out.println("Рисование данной фигуры не поддерживается");
        }
    }
    public static void draw(Figure figure, Figure.Color color) {
        if (figure instanceof Drawable) {
            Drawable d = (Drawable) figure;
            String s = d.draw(color);
            System.out.println(s);
        } else {
            System.out.println("Рисование данной фигуры не поддерживается");
        }
    }
}
