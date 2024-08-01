package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide radius:");
        if (!input.hasNextDouble()) {
            System.out.println("Please provide a positive number.");
            return;
        }
        double radius = input.nextDouble();

        System.out.println("The area of a circle of radius " + radius + " is : " + studios.areaofacircle.Circle.getArea(radius));
    }
}
