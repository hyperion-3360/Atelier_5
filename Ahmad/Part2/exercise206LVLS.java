package Atelier_5.Ahmad.Part2;


public class exercise206LVLS {


    public static void main(String[] args) {



        int number = 1234;
        int reversed = 0;



        while (number > 0) {

            int digit = number % 10;        //The % 10 operation extracts the final digit.

            reversed = reversed * 10 + digit;       //Multiplying by 10 shifts the existing digits one place to the left, making room for the new digit

            number = number / 10;       //Since both values are integers, 1234 / 10 becomes 123
        }

        System.out.println("Reversed: " + reversed);
    }

}
