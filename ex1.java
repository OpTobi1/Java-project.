// Assignment: 1 - exercise 1
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex1{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two real numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("the two numbers that you entered are: " + num1 + " and " + num2 );
        System.out.println("sum of the numbers: " + (num1 + num2) );

        double roundedNum1;
        double roundedNum2;

        if (num1 % 1.0 == 0) {
             roundedNum1 = num1;
        }
        else if (num1 < 0 ){
            roundedNum1 = (int)num1;
        }
        else {
             roundedNum1 = (int)num1 + 1;
        }

        if (num2 % 1.0 == 0) {
             roundedNum2 = num2;
        }
        else if(num2 < 0){
            roundedNum2 = (int) num2;
        }
        else {
             roundedNum2 = (int)num2 + 1;
        }

        System.out.println("Sum of the numbers rounded up: " + ((int)roundedNum1 + (int)roundedNum2) );
        System.out.println("average of the numbers: " + ((num1 + num2)/2) );
        System.out.println("Sum of the integer parts of the numbers:" + ((int)num1 + (int)num2) );
    }
}
