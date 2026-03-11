
import java.util.Scanner;

public class Day3Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez le nom de votre pays : ");
        String pays = scanner.nextLine();

        System.out.println("Nom : " + nom);
        System.out.println("Age :  " + age);
        System.out.println("Pays : " + pays);
        System.out.println("Bienvenue " + nom + " " + "au " + pays);
        System.out.println("Dans 10 ans vous aurez : " + (age + 10) + " ans");
    }
}