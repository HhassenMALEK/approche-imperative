package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreATrouver = (int) (Math.random() * 10);
        int nombreCoups = 0;
        boolean trouve = false;

        while (!trouve) {
            System.out.println("Essayez de trouver le nombre :");
            int nombreChoisi = scanner.nextInt();
            nombreCoups++;

            if (nombreChoisi == nombreATrouver) {
                System.out.println("Bravo, vous avez trouvé en " + nombreCoups + " coups !");
                trouve = true;
            } else if (nombreChoisi < nombreATrouver) {
                System.out.println("C'est plus !");
            } else {
                System.out.println("C'est moins !");
            }
        }
        scanner.close();
    }
}
