package org.example;

public class Main
{
    public static void main(String[] args)
    {
        String make = "BMW";
        String model = "530D";
        double engineSize = 3.0;
        byte gear = 2;
        short speed = (short)(gear * 20);

        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        System.out.println("The speed is " + speed);

        if (engineSize <= 1.3) {
            System.out.println("You have a weak car");
        }
        else {
            System.out.println("You have a powerful car");
        }

        if (gear == 1) {
            System.out.println("Suitable speed for first gear: up to 10mph");
        } else if (gear == 2) {
            System.out.println("Suitable speed for 2nd gear: 11 to 20mph");
        } else if (gear == 3) {
            System.out.println("Suitable speed for 3rd gear: 21 to 30mph");
        } else if (gear == 4) {
            System.out.println("Suitable speed for 4th gear: 31 to 45mph");
        } else {
            System.out.println("Suitable speed for 5th gear: over 45mph");
        }
    }
}