package com.Hello;

public class Rectangle implements Shape2DMeasuration {
   double length ,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return  2 * (length + width);
    }
}

class Triangle implements Shape2DMeasuration {
    double hypotenus,base,height;

    public Triangle(double hypotenus, double base, double height) {
        this.hypotenus = hypotenus;
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return  (1 * (base * height) ) / 2 ;
    }

    @Override
    public double perimeter() {
        return hypotenus + base + height;
    }
}
