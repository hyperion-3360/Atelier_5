package Atelier_5.Ahmad.Declaration.Part2;

public class exercise201 {
    public static void main(String[] args) {
        direBonjour("Alex");            // when this term is written, java temporarly assignes Alex to the parameter prenom
        direBonjour("Sam");
    }
    static void direBonjour(String pronom){

        System.out.println("Bonjour," + pronom + "! How are you doing?");       // and then this term uses that value to print the greeting

    }
}
