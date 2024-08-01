package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide radius:");
        double radius = -1;
        while (radius <= 0) {
            try {
                radius = input.nextDouble();
                if (radius <= 0)
                    System.out.println("Please provide a _positive_ number.");
            } catch (java.util.InputMismatchException e) {
                input.next(); // advance pass input that cause InputMismatchException
                System.out.println("Please provide a number.");
            }
        }
        input.close();
        System.out.println("The area of a circle of radius " + radius + " is : " + studios.areaofacircle.Circle.getArea(radius));
    }
}
