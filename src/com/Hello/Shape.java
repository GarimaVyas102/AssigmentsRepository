package com.Hello;

import java.util.Scanner;

public class Shape {
   private double radius;
   private double base,height;
   private double length;

    public Shape(double radius, double base, double height, double length) {
        this.radius = radius;
        this.base = base;
        this.height = height;
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}