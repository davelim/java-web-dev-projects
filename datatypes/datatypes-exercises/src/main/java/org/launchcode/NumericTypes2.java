package org.launchcode;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide miles driven:");
        float miles = input.nextFloat();
        System.out.println("Provide gallons consumed:");
        float gallon = input.nextFloat();
        System.out.println("Miles-per-gallon: " + (miles / gallon));
        input.close();
    }
}
