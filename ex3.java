// Assignment: 1 - exercise 3
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 numbers for triangle: ");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();

        if(num1 <= 0 || num2 <= 0 || num3 <= 0 ){
            System.out.println("Error");
        }
        else if((num1 + num2) <= num3 || (num1+num3) <= num2 || (num2+num3) <= num1){
            System.out.println(" We cannot make a triangle from these edges.");
        }
        else if(num1 == num2 && num1 == num3) {
            System.out.println("Equilateral triangle");
        }
        else if(num1 == num2 || num1 == num3 || num3 == num2){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}
