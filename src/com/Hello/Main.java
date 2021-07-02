package com.Hello;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ChooseShape.choose();
    }
}

 class ChooseShape {
    static Scanner sc = new Scanner(System.in);

    static  void choose(){
          System.out.println("Select the shape to calculate area and perimeters for :  ");
          System.out.println(" 1) Circle \n 2) Rectangle \n 3) Square \n 4) Triangle   \n 5) Sphere \n 6) Cylinder  ");
          String shape = sc.next();
          System.out.println("You choose "+shape );
        Shapes shapes = new Shapes();
        shapes.selectShapes(shape);
         choose();

      }
 }

