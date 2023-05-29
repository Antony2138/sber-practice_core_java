package ru.sber.java.paint;

public class Rectangle extends Figure implements Drawable{
    public Rectangle(int x, int y, int s, int p){
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
        String s = "нарисован  прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "нарисован синий прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.BLACK){
            s = "нарисован черный прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.RED){
            s = "нарисован красный прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.GREEN){
            s = "нарисован зелёный прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый прямоугольник с кодинатами " + this.point.x + " " + this.point.y;
        }
        return s;
    }
}
