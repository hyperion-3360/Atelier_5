package Atelier_5.Ahmad.Part4;

import java.util.Scanner;

public class exercise404LVLS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {4, 8, 15, 16, 23, 42};
        int position = -1;

        System.out.print("Enter a number: ");
        int search = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {         //== search compares it with the user's number.
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Position: " + (position + 1));
        }
        else {
            System.out.println("Number not found!");
        }

        scanner.close();
    }
}
// i believe this can be used as some sort of security password