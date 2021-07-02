package com.Hello;

public abstract class Circle implements Shape2DMeasuration {
    private  double radius;

      Circle(double radius){
           this.radius = radius;
      }

    @Override
    public double area() {
        return Math.PI * radius * radius  ;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}


 class CalculateCircle extends  Circle{

     CalculateCircle(double radius) {
         super(radius);
     }
 }



