package com.Hello.Assignment2;

public class Cylinder implements Shape3DMeasuration {
     double radius ,height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double Curved_SurfaceArea() throws InvalidDimensions {
        if(radius <= 0 || height <=0 ) {
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return  2 * Math.PI * radius * height ;
    }

    @Override
    public double Total_SurfaceArea() throws InvalidDimensions {
        if(radius <= 0  || height <=0){
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return  Curved_SurfaceArea() + 2 * Math.PI * radius * radius ;
    }

    @Override
    public double Volume() throws InvalidDimensions {
        if(radius <= 0 || height <=0){
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return Math.PI * radius * radius * height ;
    }
}

class Sphere implements  Shape3DMeasuration{
     double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double Curved_SurfaceArea() throws  InvalidDimensions {
        if(radius <= 0){
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double Total_SurfaceArea() throws InvalidDimensions {
        if(radius <= 0){
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return  4 * Math.PI * radius * radius;
    }

    @Override
    public double Volume() throws InvalidDimensions {
        if(radius <= 0){
            throw new InvalidDimensions("Radius should be greater than 0");
        }
        return Total_SurfaceArea() * radius / 3 ;
    }
}