// Assignment: 1 - exercise 2
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day of the week(A-G): ");
        char char1 = scan.next().charAt(0);

        switch(char1){
            case ('A'):
                System.out.println("Call center hours: 9:00-14:00");
                break;
            case ('B'):
                System.out.println("Call center hours: 9:00-13:00, 16:00-19:00");
                break;
            case ('C'):
                System.out.println("Call center hours: 9:00-14:00");
                break;
            case ('D'):
                System.out.println("Call center hours: 9:00-13:00, 16:00-19:00");
                break;
            case ('E'):
                System.out.println("Call center hours: 9:00-14:00");
                break;
            case ('F'):
                System.out.println("Call center hours: 8:00-12:00");
                break;
            case ('G'):
                System.out.println("Center is closed.");
                break;
            default:
                System.out.println("Invalid input try again.");
                break;

        }

    }
}
