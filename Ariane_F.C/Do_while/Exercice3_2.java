public class Exercice3_2
{
    public static void main(String []args)
    {
        for(int i = 1; i <= 5; i ++){  // <= et ++ declare au debut
            System.out.println(i);
        }

        int i = 1;

        while (i <= 5){  // <= declare au debut, ++ declare a la fin
            System.out.println(i);
            i ++;
        }

        int a = 1;
        do {  // ++ declare en premier, <= declare apres
            System.out.println(a);
            a ++;
        } while (a <= 5);
    }
}