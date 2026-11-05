package Atelier_5.Ahmad.Part2;


public class exercise204LVLS {
    public static void main(String[] args) {




        int number = 12345;
        int count = 0;              //to handle 0 as an input, initialize count = 1 when the number is 0




        while (number > 0) {



            number = number / 10;
            count++;
        }


        System.out.println("Number of digits: " + count);



    }
}
