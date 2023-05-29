package ru.sber.java.paint;

public class Triangle extends Figure implements Drawable{
    public Triangle(int x, int y, int s, int p){
        this.point.x = x;
        this.point.y = y;
        this.s = s;
        this.p = p;
    }

    @Override
    public double area(){
        return this.s;
    }
    @Override
    public double perimetr() {
        return this.p;
    }
    @Override
    public String draw(){
        String s = "нарисован  треугольник с кодинатами " + this.point.x + " " + this.point.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "нарисован синий треугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.BLACK){
            s = "нарисован черный треугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.RED){
            s = "нарисован красный треугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.GREEN){
            s = "нарисован зелёный треугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.YELLOW) {
            s = "нарисован жёлтый треугольник с кодинатами " + this.point.x + " " + this.point.y;
        }
        return s;
    }
}
