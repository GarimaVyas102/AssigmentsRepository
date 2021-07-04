package com.Hello.Assignment2;

public abstract class Circle implements Shape2DMeasuration {
    private  double radius;

      Circle(double radius){
           this.radius = radius;
      }

    @Override
    public double area() throws InvalidDimensions {
          if(radius <= 0) {
              throw new InvalidDimensions("Radius should be greater than 0");
          }
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() throws  InvalidDimensions {
          if(radius <= 0){
              throw new InvalidDimensions("Radius should be greater than 0");
          }
        return 2 * Math.PI * radius;
    }
}


 class CalculateCircle extends  Circle{

     CalculateCircle(double radius) {
         super(radius);
     }
 }



