package Jeevitha;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);

        System.out.println("Largest number: " + largest);

        scanner.close();
    }

    public static int findLargest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}