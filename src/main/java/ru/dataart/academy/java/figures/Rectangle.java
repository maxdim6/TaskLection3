package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    double h, w;
    Rectangle(double p, double u){
        h = p;
        w = u;
    }

    @Override

    public double calculateSq() {
        return h * w;
    }

    public double calculatePer() {
        return 2 * (h + w);
    }
}
