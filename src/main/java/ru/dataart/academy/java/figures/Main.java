package ru.dataart.academy.java.figures;

public class Main{
    public static void main(String[] args) {
        double pi = 3.14;
        Figure figs[] = new Figure[2];
        figs[0] = new Rectangle(2, 2);
        figs[1] = new Circle(2);

        Calculator calc = new Calculator();
        System.out.println(calc.getSumSq(figs));
    }
}
