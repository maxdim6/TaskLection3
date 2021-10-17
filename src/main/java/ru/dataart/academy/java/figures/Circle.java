package ru.dataart.academy.java.figures;

public class Circle extends Figure{

    double r;

    Circle(int R){
        r = R;
    }

    @Override

    public double calculateSq(){
        return 3.14 * r * r;
    }

    public double calculatePer(){
        return 2 * r * 3.14;
    }


}
