package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n********** Scientific Calculator ********** \n");
            System.out.println("Choose the operation you want to perform: \n");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int userChoice = inputScanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter a number to find its square root: ");
                    double inputNumber1 = inputScanner.nextDouble();
                    double resultSqrt = calculateSquareRoot(inputNumber1);
                    System.out.println("\nSquare root of " + inputNumber1 + " is " + resultSqrt);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int inputNumber2 = inputScanner.nextInt();
                    int resultFact = calculateFactorial(inputNumber2);
                    System.out.println("\nFactorial of " + inputNumber2 + " is " + resultFact);
                    break;
                case 3:
                    System.out.print("Enter a number to find its natural logarithm: ");
                    double inputNumber3 = inputScanner.nextDouble();
                    double resultLog = calculateNaturalLogarithm(inputNumber3);
                    System.out.println("\nNatural logarithm of " + inputNumber3 + " is " + resultLog);
                    break;
                case 4:
                    System.out.print("Enter base (x) value: ");
                    double base = inputScanner.nextDouble();
                    System.out.print("Enter exponent (b) value: ");
                    double exponent = inputScanner.nextDouble();
                    double resultPower = calculatePowerFunction(base, exponent);
                    System.out.println("\n" +base + " to the power " + exponent + " is " + resultPower);
                    break;
                case 5:
                    System.out.println("\nExiting...");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static int calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static double calculateNaturalLogarithm(double number) {
        return Math.log(number);
    }

    public static double calculatePowerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}