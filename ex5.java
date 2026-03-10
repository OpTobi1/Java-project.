// Assignment: 1 - exercise 5
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex5 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number in binary representation:");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number in binary representation:");
        int num2 = scan.nextInt();



        int num1in10 = 0;
        int multi1 = 1;
        int originalNum1 = num1;

        while (originalNum1 > 0) {
            int Digit1 = originalNum1 % 10;
            num1in10 += Digit1 * multi1;
            multi1 = multi1 * 2;
            originalNum1 = originalNum1 / 10;
        }



        int num2in10 = 0;
        int multi2 = 1;
        int originalNum2 = num2;

        while (originalNum2 > 0) {
            int lastDigit = originalNum2 % 10;
            num2in10 += lastDigit * multi2;
            multi2 = multi2 * 2;
            originalNum2 = originalNum2 / 10;
        }


        int num3in10 = num1in10 + num2in10;
        String num3 = "";
        int sumToConvert = num3in10;


        if (sumToConvert == 0) {
            num3 = "0";
        }
        else {
            while (sumToConvert > 0) {
                int digit3 = sumToConvert % 2;
                num3 = digit3 + num3;
                sumToConvert = sumToConvert / 2;
            }
        }

        System.out.println("The sum is: " + num3);

    }
}
