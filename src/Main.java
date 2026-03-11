////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    IO.println(String.format("Hello and welcome!"));
//
//    for (int i = 1; i <= 5; i++) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        IO.println("i = " + i);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String nom = "Antoinette";
//        int age = 26;
//        String language = "Java";
//        String pays = "Congo";
//
////        System.out.println("Je m'appelle " + nom);
////        System.out.println("J'ai " + age);
////        System.out.println("J'habite au " + pays);
////        System.out.println("J'apprends aujourd'hui " + language);
//        System.out.println("Nom : " + nom);
//        System.out.println("Age : " + age);
//        System.out.println("Dans 5 ans j'aurai : " + (age + 5));
//        System.out.println("Dans 10 ans j'aurai : " + (age + 10));
//    }
//}

import java.util.Scanner;

public class Main {
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