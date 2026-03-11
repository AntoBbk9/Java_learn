import java.util.Scanner;

public class Day4Conditions  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Entrez votre age : ");
//        int age = scanner.nextInt();
//
//        if (age >= 18) {
//            System.out.println("Vous êtes majeur");
//        } else {
//            System.out.println("Vous êtes mineur");
//        }

//        System.out.print("Entrez votre age : ");
//        int age = scanner.nextInt();
//
//        if (age < 18) {
//            System.out.println("Accès refusé");
//        } else {
//            System.out.println("Bienvenue Antoinette");
//        }

//        System.out.print("Entrez votre note : ");
//        int note = scanner.nextInt();
//
//        if (note >= 16 && note <= 20) {
//            System.out.println("Très bien");
//        } else if (note >= 14 && note <= 15 ) {
//            System.out.println("Bien");
//        } else if (note >= 10 && note <= 13) {
//            System.out.println("Passable");
//        }else{
//            System.out.println("Echec");
//        }

        System.out.print("Entrez votre Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez votre Pays : ");
        String pays = scanner.next();

        if (age <= 18 ) {
            System.out.println("Désolé vous êtes mineur");
        } else{
            System.out.println("Bienvenue " + nom + " " + "du " + pays);
        }

    }
}