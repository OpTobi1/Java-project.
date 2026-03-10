// Assignment: 1 - exercise 10
// Author: Liav Lugasi, ID: 213007271


import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the initial number of cells:");
        int numCell = scan.nextInt();

        System.out.println("Enter the number of generations:");
        int numGen = scan.nextInt();

        long countAge0 = numCell;
        long countAge1 = 0;
        long countAge2 = 0;

        for (int i = 0; i < numGen; i++) {

            long currentAge0 = countAge0;
            long currentAge1 = countAge1;
            long currentAge2 = countAge2;

            long next_countAge0 = currentAge1 + currentAge2;
            long next_countAge1 = currentAge0;
            long next_countAge2 = currentAge1;

            countAge0 = next_countAge0;
            countAge1 = next_countAge1;
            countAge2 = next_countAge2;
        }

        long totalCell = countAge0 + countAge1 + countAge2;

        System.out.println("After " + numGen + " generations there are " + totalCell + " cells.");

    }
}