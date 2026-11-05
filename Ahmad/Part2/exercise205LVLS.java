package Atelier_5.Ahmad.Part2;


public class exercise205LVLS {
    public static void main(String[] args) {

        int a = 48;

        int b = 18;

        while (b != 0) {


            int remainder = a % b;

            a = b;              //When b becomes 0, the loop stops. The value of a is the PGCD, which is 6.
            b = remainder;
        }

        System.out.println("PGCD: " + a);





    }
}

//Euclid's algorithm repeatedly uses the remainder of a division