package org.launchcode.studio.areaofcircle;

import java.util.Scanner;


public class Area {
public static void main(String[]args){
    double radius;
//    double area;
    double Pi=3.14;
    Circle circle=new Circle();
    Scanner input =new Scanner(System.in);
    System.out.println("Enter a radius: ");
     radius=input.nextDouble();
//     area=Pi*radius*radius;
  do{

       if(radius<0){
           System.out.println("Error the radius cannot be negative");
break;
       }
    System.out.println("the area of a circle of radius "+radius+ " is: \n"+ circle.getArea(radius));
       break;
  }while (radius>0);

        }
}
