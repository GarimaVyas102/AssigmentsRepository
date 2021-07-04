package com.Hello;
import  java.util.*;

public class Shapes {
       private  double radius,side,length,width,height;

    Scanner sc = new Scanner(System.in);


      void selectShapes(String shape){
               switch (shape){

                   case "Circle" :
                       try {
                           System.out.printf(" Enter the radius :  ");
                           radius = sc.nextDouble();
                           System.out.println("radius = " + radius);
                           CalculateCircle calculateCircle = new CalculateCircle(radius);
                           System.out.printf("area is : %.2f \n", calculateCircle.area());
                           System.out.printf("Circumference of Circle : %.2f \n", calculateCircle.perimeter());
                       }catch(Exception e){
                           System.out.println("Exception Occured  in " +e);
                   }
                       break;

                   case "Square":
                       try {
                           System.out.printf("Enter the side : ");
                           side = sc.nextDouble();
                           System.out.println("side = " + side);
                           Square square = new Square(side);
                           System.out.printf("Area of Square : %.2f \n", square.area());
                           System.out.printf("Perimeter of Square : %.2f \n", square.perimeter());
                       }catch (Exception e){
                           System.out.println( "Exception Occured in "+e);
                       }
                       break;

                   case "Rectangle" :
                       try {
                           System.out.printf("Enter the length : ");
                           length = sc.nextDouble();
                           System.out.printf("Enter the Width :  ");
                           width = sc.nextDouble();
                           System.out.println("length = " + length + " Width =  " + width);
                           Rectangle rectangle = new Rectangle(length, width);
                           System.out.printf("Area of Rectangle : %.2f \n", rectangle.area());
                           System.out.printf("Perimeter of Rectangle : %.2f \n", rectangle.perimeter());
                       }catch (Exception e){
                           System.out.println( "Exception Occured in "+e);
                       }
                       break;

                   case "Triangle" :
                       try {
                           System.out.printf("Enter the  length  : ");
                           length = sc.nextDouble();
                           System.out.printf("Enter the  Width    : ");
                           width = sc.nextDouble();
                           System.out.printf("Enter the  Height  : ");
                           height = sc.nextDouble();
                           System.out.println("length :  " + length + " Width : " + width + " Height : " + height);
                           Triangle triangle = new Triangle(height, width, length);
                           System.out.printf("Area of Triangle : %.2f \n", triangle.area());
                           System.out.printf("Perimeter of Triangle : %.2f \n", triangle.perimeter());
                       }catch(Exception e){
                       System.out.println("Exception Occured in "+e);
                   }
                       break;

                       case  "Sphere"   :
                           try {
                               System.out.printf(" Enter the radius :  ");
                               radius = sc.nextDouble();
                               System.out.println("radius  of  Sphere = " + radius);
                               Sphere sphere = new Sphere(radius);
                               System.out.printf("Curved Surface  Area of  Sphere  : %.2f \n ", sphere.Curved_SurfaceArea());
                               System.out.printf("Total Surface  Area of  Sphere  : %.2f \n ", sphere.Total_SurfaceArea());
                               System.out.printf("Volume of  Sphere  : %.2f \n", sphere.Volume());
                           }catch (Exception e){
                               System.out.println("Exception Occured in "+ e);
                           }
                        break;

                   case "Cylinder" :
                       try {
                           System.out.printf("Enter the Radius : ");
                           radius = sc.nextDouble();
                           System.out.printf("Enter the Height : ");
                           height = sc.nextDouble();
                           System.out.println("radius = " + radius + "Height =  " + height);
                           Cylinder cylinder = new Cylinder(radius, height);
                           System.out.printf("Curved Surface Area of Cylinder   : %.2f  \n", cylinder.Curved_SurfaceArea());
                           System.out.printf("Total Surface Area of Cylinder   : %.2f  \n", cylinder.Total_SurfaceArea());
                           System.out.printf("Volume of Cylinder   : %.2f  \n", cylinder.Volume());
                       }catch (Exception e){
                           System.out.println("Exception Occured in" +e);
                       }
                       break;

                   default:
                       System.out.println("You are choosing wrong  Shape  ");

               }
       }
}


 interface Shape2DMeasuration {
     double area() throws InvalidDimensions;
     double perimeter() throws InvalidDimensions;

  }

  interface  Shape3DMeasuration {
        double Curved_SurfaceArea() throws InvalidDimensions;
        double Total_SurfaceArea() throws InvalidDimensions;
        double  Volume() throws InvalidDimensions;
   }


   class InvalidDimensions extends Exception{
    InvalidDimensions(String s){
    super(s);
    }
   }
