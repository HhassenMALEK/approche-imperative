package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez saisir un rang pour le calcul de la suite de Fibonacci :");
        int rang = scan.nextInt();

        if (rang >= 0) {
            int[] tab = new int[rang + 1];
            tab[0] = 0;
            if (rang > 0) {
                tab[1] = 1;
                for (int i = 2; i <= rang; i++) {
                    tab[i] = tab[i - 1] + tab[i - 2];
                }
            }
            System.out.println("Le nombre de Fibonacci pour le rang " + rang + " est : " + tab[rang]);
        } else {
            System.out.println("Saisie invalide. Veuillez entrer un rang positif ou nul.");
        }

        scan.close();
    }
}
