package Atelier_5.Ahmad.Declaration.Part2;


public class exercise204BONS {

    public static void main(String[] args) {
        afficherInfos(16, 1.75, "Alex", true);
    }

    static void afficherInfos(int age, double taille,String nom, boolean etudiant) {
                             

        System.out.println(age + " " + taille + " "+ nom + " " + etudiant);



    }


}

//The arguments must be passed in the correct order and with compatible types. 
//For example, afficherInfos("Alex", 16, true, 1.75); would produce a compilation error because the argument types don't match the parameter order.