package Atelier_5.Ahmad.Declaration.Part3;


public class exercise302 {

    public static void main(String[] args) {

        System.out.println(estPair(4));

        System.out.println(estPair(7));

        System.out.println(estPair(10));
    }

    static boolean estPair(int n) {                 //here we use a boolean cause we want a result as a true or false

        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
//When Java executes return true; or return false;, it immediately exits the method and returns that Boolean value to the caller.