package Atelier_5.Ahmad.Part3;

public class exercise304LVLS {
    public static void main(String[] args) {
        
        int dice;
        int attempts = 0;

        do {
            dice = (int)(Math.random() * 6) + 1;  // generates a random number
            attempts++;

            System.out.println("Rolled: " + dice);

        } while (dice != 6);

        System.out.println("Total rolls: " + attempts);


    }
}
