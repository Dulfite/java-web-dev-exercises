package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of a circle? ");

        Double radius = input.nextDouble();
        Double area = Circle.getArea();
//                3.14 * radius * radius;

        System.out.println("The area of a circle of radius " + radius + "is: " + area);
    }
}
