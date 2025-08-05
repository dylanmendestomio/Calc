package com.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char sign;

        System.out.println("First number: ");
        num1 = input.nextInt();

        System.out.println("Number sign (+, -, * or /): ");
        sign = input.next().charAt(0);

        System.out.println("Second number: ");
        num2 = input.nextInt();

        if(sign == '+'){
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
         if(sign == '-'){
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
         if(sign == '*'){
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
         if(sign == '/'){
            result = num1 / num2;
            System.out.println("Result: " + result);
        }

        input.close();
    }
}