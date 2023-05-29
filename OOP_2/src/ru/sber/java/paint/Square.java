package ru.sber.java.paint;

public class Square extends Figure implements Drawable{
    public Square(int x, int y, int s, int p){
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
        String s = "нарисован  квадрат с кодинатами " + this.point.x + " " + this.point.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "нарисован синий квадрат с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.BLACK){
            s = "нарисован черный квадрат с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.RED){
            s = "нарисован красный квадрат с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.GREEN){
            s = "нарисован зелёный квадрат с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый квадрат с кодинатами " + this.point.x + " " + this.point.y;
        }
        return s;
    }
}
