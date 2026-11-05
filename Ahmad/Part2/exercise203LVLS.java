package Atelier_5.Ahmad.Part2;


import java.util.Scanner;

public class exercise203LVLS {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        int number = -1;
        int count = 0;




        while (number != 0) {



            System.out.print("Enter a number please , it can be any number: ");
            number = scanner.nextInt();

            if (number != 0) {          //repreats as long as i/or the user don't enter zero
                count++;
            }




        }

        System.out.println("Numbers entered: " + count);





        scanner.close();
    }
}
//A sentinel is a special value used to tell a program when to stop. Here, 0 is the sentinel.