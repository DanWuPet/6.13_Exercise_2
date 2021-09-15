package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 25;
        double result = squareRoot(a);
        System.out.println(result);
    }

    public static double squareRoot(double a){
        double x = a/2;
        double oldX = (-1);

        while(Math.abs(oldX - x ) > 0.0001){
            oldX = x;
            x = (x + a/x) / 2;
        }

        return x;

    }
}
