package org.example;

public class Main {
    public static void main(String[] args) {
        String make = "BMW";
        String model = "530D";
        double engineSize = 3.0;
        byte gear = 2;
        short speed = (short)(gear * 20);

        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The speed is " + speed);
    }
}