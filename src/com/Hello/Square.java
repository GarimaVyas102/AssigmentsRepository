package com.Hello;

public class Square implements Shape2DMeasuration {
    double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side  ;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

