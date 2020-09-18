package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Please enter an operation in lowercase, add, sub, div, mul: ");
        Scanner input = new Scanner(System.in);
        String operation = input.next();
        System.out.println("Please enter the first number: ");
        double number1 = input.nextDouble();
        System.out.println("Please enter the second number");
        double number2 = input.nextDouble();

        switch(operation){
            case "add":
                System.out.println(number1 + number2);
                break;
            case "sub":
                System.out.println(number1 - number2);
                break;
            case "div":
                System.out.println(number1 / number2);
                break;
            case "mul":
                System.out.println(number1 * number2);
            default:
                System.out.println("Invalid operation or number");

            input.close();


        }
    }
}
