package Atelier_5.Ahmad.Declaration.Part1;

public class exercise102 {
    

    public static void main(String[] args) {
        afficherlinge();
        afficherlinge();
        afficherlinge();

    }

    static void afficherlinge() {
        for (int i = 1 ; i <= 20 ; i++) {
            System.out.print("-");              // we use this term to make the '-' appear on the same line

        }
        System.out.println();           //this skips to the next line
    }
}
// this shows that we can write the method one time and then can use it multiple times.