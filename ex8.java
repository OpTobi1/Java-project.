// Assignment: 1 - exercise 8
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex8 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int lowerBound = 0;
        int upperBound = 0;
        int attempts = 0;
        boolean isValidInput = false;


        while (attempts < 3 && !isValidInput) {
            System.out.println("Attempt " + (attempts + 1) + " of 3 ");

            System.out.println("enter lower bound: ");
            lowerBound = scan.nextInt();

            System.out.println("enter upper bound: ");
            upperBound = scan.nextInt();

            if (lowerBound < 0 || upperBound < 0) {
                System.out.println("Error: Both numbers must be non-negative.");
            }
            else if (lowerBound > upperBound) {
                System.out.println("Error: Lower bound must be less than or equal to upper bound.");
            }
            else {
                isValidInput = true;
            }
            attempts++;
        }


        if (!isValidInput) {
            System.out.println("Error: 3 invalid attempts. Exiting program.");
        }
        else {
            System.out.println("Prime numbers in range [" + lowerBound + " ... " + upperBound + "]:");

            boolean foundAPrime = false;

            for (int num = lowerBound; num <= upperBound; num++) {

                boolean isPrime = true;

                if (num <= 1) {
                    isPrime = false;
                }
                else {
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }


                if (isPrime) {
                    System.out.println(num);
                    foundAPrime = true;
                }
            }

            if (!foundAPrime) {
                System.out.println("No Prime numbers in this range");
            }
        }
    }
}
