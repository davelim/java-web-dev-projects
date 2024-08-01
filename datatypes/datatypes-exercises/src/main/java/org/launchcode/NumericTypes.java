package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide length:");
        int length = input.nextInt();
        System.out.println("Provide width:");
        int width = input.nextInt();
        System.out.println("Area of " + length + " x " + width + " rectangle: " + (length * width));
    }
}
