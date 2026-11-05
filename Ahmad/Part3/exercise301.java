package Atelier_5.Ahmad.Part3;

import java.util.Scanner;

public class exercise301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //allows the user to enter a number
        int number;

        do {
            System.out.print("Enter a positive number that is positive: ");
            number = scanner.nextInt();                                         //reads the entered number 
        } while (number <= 0);                  // reapeats the loop as till a number is positive

        System.out.println("Valid number: " + number);

        scanner.close();
    }
    
}
