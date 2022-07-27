package lesson2;

import java.lang.Math;

public class Task2 {
    public static void main(String[] args){
       int aSideRect = 10;
       int bSideRect = 15;  //double squareRect = aSideRect * bSideRect;
       double rad = 10.0;

       double squareCircle = Math.PI * Math.pow(rad,2.0);
       int squareRect = aSideRect * bSideRect;

       System.out.println("square rectangle: " + squareRect);
       System.out.println("square circle: " + squareCircle);
    }
}
