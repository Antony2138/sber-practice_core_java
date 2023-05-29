package ru.sber.java.paint;

public class Circle  extends Figure implements Drawable {
    public Circle(int x, int y, int s, int p){
        point.x = x;
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
        String s = "нарисован  круг с кодинатами " + this.point.x + " " + this.point.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "нарисован синий круг с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.BLACK){
            s = "нарисован черный круг с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.RED){
            s = "нарисован красный круг с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.GREEN){
            s = "нарисован зелёный круг с кодинатами " + this.point.x + " " + this.point.y;
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый круг с кодинатами " + this.point.x + " " + this.point.y;
        }
        return s;
    }
}
