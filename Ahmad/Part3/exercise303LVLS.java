
package Atelier_5.Ahmad.Part3;

import java.util.Scanner;

public class exercise303LVLS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Sushi");
            System.out.println("2. glass of tea");
            System.out.println("3. Quit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Hello! , we don't have sushi right now");
            }
            else if (choice == 2) {
                System.out.println("Good choice , guess what , we don't have tea");
            }
            else if (choice == 3) {
                System.out.println("Closing program...");
            }
            else {
                System.out.println("Invalid option!");
            }

        } while (choice != 3);

        scanner.close();
    }
}
//Because the menu must appear at least once before the program can ask the user whether to continue. meaning the program should excute first and then check for conditions