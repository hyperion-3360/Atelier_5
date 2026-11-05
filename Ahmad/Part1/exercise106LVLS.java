package Atelier_5.Ahmad.Part1;


public class exercise106LVLS {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {   // controls the number of lines




            for (int j = 1; j <= i; j++) {      //controls how many stars appear on each line
                System.out.print("*");
            }



            System.out.println();  //moves to a new line when the last print was done
        }
    }
}
