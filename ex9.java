// Assignment: 1 - exercise 9
// Author: Liav Lugasi, ID: 213007271


import java.util.Scanner;

public class ex9 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();
        int num1 = num;

        System.out.println("The prime factors of " + num + " are:");

        for(int i = 2; i < num1; i++){
            while(num1 % i == 0){
                System.out.println(i);
                num1 = num1 / i;
            }
        }
    }
}
