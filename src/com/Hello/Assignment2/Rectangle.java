package com.Hello.Assignment2;

// Rectangle class
public class Rectangle implements Shape2DMeasuration {
   double length ,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() throws InvalidDimensions {
        if(length <= 0  || width <= 0 ){
            throw new InvalidDimensions("Dimensions should be greater than 0") ;
        }
        return length * width;
    }

    @Override
    public double perimeter() {
        return  2 * (length + width);
    }
}

 // Triangle Class
class Triangle implements Shape2DMeasuration {
    double hypotenus,base,height;

    public Triangle(double hypotenus, double base, double height) {
        this.hypotenus = hypotenus;
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() throws  InvalidDimensions {
        if(base <= 0  || height <= 0 ){
            throw new InvalidDimensions("Dimensions should be greater than 0") ;
        }
        return  (1 * (base * height) ) / 2 ;
    }

    @Override
    public double perimeter() throws InvalidDimensions{
        if(base <= 0  || height <= 0 ){
            throw new InvalidDimensions("Dimensions should be greater than 0") ;
        }
        return hypotenus + base + height;
    }
}
