package Atelier_5.Ahmad.Part1;


public class exercise105LVLS {
    public static void main(String[] args) {

        int n = 9;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
    }
}

// A factorial means multiplying a positive integer by every positive integer below it, down to 1.
// factorial = factorial * i is the same thing as factorial*=i