import java.util.Scanner;
public class Exercice3_1
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        double nombre;
        do
        {
        System.out.println("Entrez un nombre: ");
        nombre = scanner.nextDouble();
        } while (nombre <= 0);

        scanner.close();
    }
}