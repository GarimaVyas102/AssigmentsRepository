package com.Hello;
import  java.util.*;

public class Shapes {
       private  double radius,side,length,width,height;

    Scanner sc = new Scanner(System.in);


      void selectShapes(String shape){
               switch (shape){

                   case "Circle" :
                       System.out.printf(" Enter the radius :  ");
                        radius = sc.nextDouble();
                       System.out.println("radius = " +radius);
                       CalculateCircle calculateCircle = new CalculateCircle(radius);
                       System.out.printf("area is : %.2f \n" ,calculateCircle.area());
                       System.out.printf("Circumference of Circle : %.2f \n" ,calculateCircle.perimeter()) ;
                       break;

                   case "Square":
                       System.out.printf("Enter the side : ");
                       side = sc.nextDouble();
                       System.out.println("side = " +side);
                       Square square = new Square(side);
                       System.out.printf("Area of Square : %.2f \n" ,square.area());
                       System.out.printf("Perimeter of Square : %.2f \n" ,square.perimeter());
                        break;

                   case "Rectangle" :
                       System.out.printf("Enter the length and Width : ");
                       length = sc.nextDouble();
                       width =  sc.nextDouble();
                       System.out.println("length = " +length + "Width =  " +width);
                        Rectangle rectangle = new Rectangle(length,width);
                       System.out.printf("Area of Rectangle : %.2f \n" ,rectangle.area());
                       System.out.printf("Perimeter of Rectangle : %.2f \n" ,rectangle.perimeter());
                       break;

                   case "Triangle" :
                       System.out.printf("Enter the length , Width and Height  : ");
                       length = sc.nextDouble();
                       width =  sc.nextDouble();
                       height = sc.nextDouble();
                       System.out.println("length :  " +length + " Width : "  + width + " Height : " +height);
                       Triangle triangle = new Triangle(height,width,length);
                       System.out.printf("Area of Triangle : %.2f \n" ,triangle.area() );
                       System.out.printf("Perimeter of Triangle : %.2f \n" ,triangle.perimeter() );
                       break;

                       case  "Sphere"   :
                           System.out.printf(" Enter the radius :  ");
                           radius = sc.nextDouble();
                           System.out.println("radius  of  Sphere = " +radius);
                           Sphere sphere = new Sphere(radius);
                           System.out.printf("Curved Surface  Area of  Sphere  : %.2f \n " ,sphere.Curved_SurfaceArea() );
                           System.out.printf("Total Surface  Area of  Sphere  : %.2f \n " ,sphere.Total_SurfaceArea() );
                           System.out.printf("Volume of  Sphere  : %.2f \n" ,sphere.Volume() );
                        break;

                   case "Cylinder" :
                       System.out.printf("Enter the Radius and Height of Cylinder : ");
                       radius = sc.nextDouble();
                       height =  sc.nextDouble();
                       System.out.println("radius = " +radius  + "Height =  "  +height );
                       Cylinder cylinder = new Cylinder(radius,height);
                       System.out.printf("Curved Surface Area of Cylinder   : %.2f  \n", cylinder.Curved_SurfaceArea() );
                       System.out.printf("Total Surface Area of Cylinder   : %.2f  \n", cylinder.Total_SurfaceArea() );
                       System.out.printf("Volume of Cylinder   : %.2f  \n", cylinder.Volume() );
                       break;

                   default:
                       System.out.println("You are choosing wrong  Shape  ");

               }
       }
}


 interface Shape2DMeasuration {
     double area();
     double perimeter();

  }

  interface  Shape3DMeasuration {
        double Curved_SurfaceArea();
        double Total_SurfaceArea();
        double  Volume();
   }


