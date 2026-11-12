package Atelier_5.Ahmad.Declaration.Part3;


public class exercise301 {

    public static void main(String[] args) {

        int resultat = carre(5);

        System.out.println("Resultat : " + resultat);
    }
                
    static int carre(int n) {               //The second int indicates that n is an integer parameter.The first int indicates the method returns an integer.

        return n * n;

    }
}
