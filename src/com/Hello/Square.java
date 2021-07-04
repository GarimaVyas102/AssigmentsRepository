package com.Hello;

public class Square implements Shape2DMeasuration {
    double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double area() throws  InvalidDimensions{
        if(side <= 0){
            throw new InvalidDimensions("side should be greater than 0");
        }
        return side * side  ;
    }

    @Override
    public double perimeter() throws InvalidDimensions {
        if(side <= 0){
            throw new InvalidDimensions("side should be greater than 0");
        }
        return 4 * side;
    }
}

