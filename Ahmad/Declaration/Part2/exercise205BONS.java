package Atelier_5.Ahmad.Declaration.Part2;

public class exercise205BONS {

    public static void main(String[] args) {

        afficherRectangle(5, 3);

    }

    static void afficherRectangle(int largeur, int hauteur) {



        for (int i = 1; i <= hauteur; i++) {            //The outer loop controls the height



            for (int j = 1; j <= largeur; j++) {            //The inner loop controls the width
                System.out.print("*");
            }

            System.out.println();               //Each time the outer loop executes, the inner loop prints an entire row of stars


        }

    }

}