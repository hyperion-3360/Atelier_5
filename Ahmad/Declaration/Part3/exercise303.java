package Atelier_5.Ahmad.Declaration.Part3;


public class exercise303 {

    public static void main(String[] args) {

        int resultat = maximum(12, 25);

        System.out.println("Maximum : " + resultat);
    }

    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
//The method maximum() is responsible for finding the maximum. The main() method is responsible for deciding what to do with the returned value.
