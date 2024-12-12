package assignments.ex1;

import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";

        while (!num1.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();

            if (num1.equals(quit)) {
                break;
            }

            boolean isNum1Valid = Ex1.isNumber(num1);
            int value1 = Ex1.number2Int(num1);
            System.out.println("num1= " + num1 + " is number: " + isNum1Valid + " , value: " + value1);

            if (!isNum1Valid) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }

            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();

            if (num2.equals(quit)) {
                break;
            }

            boolean isNum2Valid = Ex1.isNumber(num2);
            int value2 = Ex1.number2Int(num2);
            System.out.println("num2= " + num2 + " is number: " + isNum2Valid + " , value: " + value2);

            if (!isNum2Valid) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }

            System.out.println("Enter a base for output: (a number [2,16]");
            int base = sc.nextInt();

            if (base < 2 || base > 16) {
                System.out.println("ERR: Invalid base " + base);
                continue;
            }

            int sum = value1 + value2;
            int product = value1 * value2;

            String sumInBase = Ex1.int2Number(sum, base);
            String productInBase = Ex1.int2Number(product, base);

            System.out.println(num1 + " + " + num2 + " = " + sumInBase);
            System.out.println(num1 + " * " + num2 + " = " + productInBase);

            String[] values = {num1, num2, sumInBase, productInBase};
            int maxIndex = Ex1.maxIndex(values);

            System.out.println("Max number over [" + String.join(",", values) + "] is: " + values[maxIndex]);
        }

        System.out.println("quitting now...");
    }
}