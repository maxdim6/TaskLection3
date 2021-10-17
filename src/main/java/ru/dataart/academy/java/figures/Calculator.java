package ru.dataart.academy.java.figures;

public class Calculator {


    public double getSumSq(Figure [] arr){
        System.out.println(arr);
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].calculateSq();
        }
        return res;
    }


}
