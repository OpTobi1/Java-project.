// Assignment: 1 - exercise 4
// Author: Liav Lugasi, ID: 213007271

import  java.util.Scanner;

public class ex4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in binary representation: ");
        int num = scan.nextInt();
        int originalNum = num;

        int numIn10 = 0;
        int multi = 1;

        while (num > 0){
            int digit = num % 10;
            numIn10 += digit * multi;
            multi *= 2;
            num = num / 10;
        }

        System.out.println(originalNum + " (in base 2) = " + numIn10 + " (in base 10)");
    }
}
