
package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[0];
        boolean sortie = false;

        while (!sortie) {
            System.out.println("Options:");
            System.out.println("1 - Ajouter une valeur");
            System.out.println("2 - Afficher les valeurs saisies");
            System.out.println("3 - Quitter le programme.");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saisissez une valeur :");
                    int valeur = scan.nextInt();
                    int[] tmp = new int[tab.length + 1];
                    for (int i = 0; i < tab.length; i++) {
                        tmp[i] = tab[i];
                    }
                    tmp[tab.length] = valeur;
                    tab = tmp;
                    break;
                case 2:
                    for (int i = 0; i < tab.length; i++) {
                        System.out.print(tab[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    sortie = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir entre 1, 2 et 3.");
                    break;
            }
        }
        scan.close();
    }
}
