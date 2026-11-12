package Atelier_5.Ahmad.Declaration.Part3;


public class exercise306BONS {

    public static void main(String[] args) {

        int resultat = maximum3(12, 25, 18);        //finds the largest of three values by using maximum() twice.

        System.out.println("Maximum : " + resultat);


    }

    static int maximum(int a, int b) {                  //returns the larger of two values.



        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    static int maximum3(int a, int b, int c) {

        int premierMaximum = maximum(a, b);

        return maximum(premierMaximum, c);
    }
}

//Java evaluates the inner method call first ."nested method calls"