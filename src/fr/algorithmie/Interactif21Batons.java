package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int batons = 21;
        boolean fini = false;
        while (!fini) {
            System.out.println("Il reste " + batons + " bâtons. Combien voulez-vous en prendre ? (1, 2 ou 3)");

            int nbBatonsJoueur = -1;
            while (nbBatonsJoueur < 1 || nbBatonsJoueur > 3) {
                if (scan.hasNextInt()) {
                    nbBatonsJoueur = scan.nextInt();
                    if (nbBatonsJoueur < 1 || nbBatonsJoueur > 3) {
                        System.out.println("Veuillez entrer un nombre valide entre 1 et 3.");
                    }
                } else {
                    System.out.println("Entrée invalide. Veuillez entrer un nombre entre 1 et 3.");
                    scan.next(); // Consomme l'entrée incorrecte
                }
            }

            if (batons - nbBatonsJoueur <= 0) {
                System.out.println("Vous avez pris le dernier bâton. Vous avez perdu !");
                fini = true;
            } else {
                batons -= nbBatonsJoueur;
            }

            if (!fini) {
                int nbBatonsOrdinateur = (batons % 4 == 0) ? 1 : 4 - nbBatonsJoueur;

                // Vérification pour savoir si l'ordinateur prend le dernier bâton
                if (batons - nbBatonsOrdinateur <= 0) {
                    System.out.println("L'ordinateur a pris " + nbBatonsOrdinateur + " bâton(s).");
                    System.out.println("L'ordinateur a pris le dernier bâton. L'ordinateur a perdu !");
                    fini = true;
                } else {
                    batons -= nbBatonsOrdinateur;
                    System.out.println("L'ordinateur a pris " + nbBatonsOrdinateur + " bâton(s). Il reste " + batons + " bâton(s).");
                }
            }
        }
        System.out.println("Le jeu est terminé. Merci d'avoir joué !");
        scan.close();
    }
}
