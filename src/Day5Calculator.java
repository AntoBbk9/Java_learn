import java.util.Scanner;

public class Day5Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Afficher le menu
        System.out.println("=== Mini Calculateur Java ===");
        System.out.println("1 - Addition");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Choisissez une option (1-4) : ");

        int choix = scanner.nextInt();

        // Demander les nombres
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        // Calculer selon le choix
        if (choix == 1) {
            System.out.println("Résultat : " + (num1 + num2));
        } else if (choix == 2) {
            System.out.println("Résultat : " + (num1 - num2));
        } else if (choix == 3) {
            System.out.println("Résultat : " + (num1 * num2));
        } else if (choix == 4) {
            if (num2 != 0) {
                System.out.println("Résultat : " + (num1 / num2));
            } else {
                System.out.println("Erreur : division par zéro impossible !");
            }
        } else {
            System.out.println("Option invalide !");
        }
    }
}