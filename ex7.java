// Assignment: 1 - exercise 7
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;


public class ex7 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter position: ");
        int num2 = scan.nextInt();

        int count = 0;
        int tempnum1 = num1;

        if (num1 == 0){
            count = 1;
        }
        while (tempnum1 > 0){
            tempnum1 = tempnum1 / 10 ;
            count++;
        }

        if (num2>count){
            System.out.println("No digit at this position.");
        }
        else{
            tempnum1 = num1;

            for(int i = 0; i < num2; i++){
                tempnum1 = tempnum1 / 10;
            }

            int digit = tempnum1 % 10;

            System.out.println("the digit at position " + num2 + " is: " + digit);
        }

    }
}
