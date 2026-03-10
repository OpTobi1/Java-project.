// Assignment: 1 - exercise 6
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex6 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        byte n = (byte) (Math.random() * 10);

        int num1 = 10;

        int result1 = 1;
        int result2 = 1;

        for (int i = 0; i < n; i++){
            result1 = result1 * num1;
        }

        for (int i = 0; i < n+1; i++){
            result2 = result2 * num1;
        }


        for(int num2 = result1; num2 <= result2; num2++){

            int originalNum = num2;
            int reversedNum = 0;
            int num3 = num2;

            while(num3 > 0){
                int digit = num3 % 10;
                reversedNum = (reversedNum * 10) + digit;
                num3 = num3 / 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum);
            }

        }
    }
}
