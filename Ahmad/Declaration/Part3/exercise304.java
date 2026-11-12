package Atelier_5.Ahmad.Declaration.Part3;


public class exercise304 {

    public static void main(String[] args) {



        double resultat = moyenne(80, 90, 95);



        System.out.println("Moyenne : " + resultat);


    }

    static double moyenne(int a, int b, int c) {



        return (a + b + c) / 3.0;               //Using 3.0 ensures the calculation uses floating-point division and preserves the fractional part.

    }

}

