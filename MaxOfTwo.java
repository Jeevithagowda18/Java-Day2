package Jeevitha;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number: " + max);

        scanner.close();
    }
}



