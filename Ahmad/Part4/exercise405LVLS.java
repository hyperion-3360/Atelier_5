package Atelier_5.Ahmad.Part4;

import java.util.Scanner;

public class exercise405LVLS {


    public static void main(String[] args) {






        
        Scanner scanner = new Scanner(System.in);



        int number;
        int sum = 0;

        while (true) {

            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {       // the moment the number is negative , it stops/breaks
                break;
            }

            if (number > 0) {
                sum += number;
            }
        }

        System.out.println("Total sum: " + sum);

        scanner.close();
    }
    
}
