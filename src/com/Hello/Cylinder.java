package com.Hello;

public class Cylinder implements  Shape3DMeasuration {
     double radius ,height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double Curved_SurfaceArea() {
        return  2 * Math.PI * radius * height ;
    }

    @Override
    public double Total_SurfaceArea() {
        return  Curved_SurfaceArea() + 2 * Math.PI * radius * radius ;
    }

    @Override
    public double Volume() {
        return Math.PI * radius * radius * height ;
    }
}

class Sphere implements  Shape3DMeasuration{
     double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double Curved_SurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double Total_SurfaceArea() {
        return  4 * Math.PI * radius * radius;
    }

    @Override
    public double Volume() {
        return Total_SurfaceArea() * radius / 3 ;
    }
}