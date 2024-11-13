package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int nb;

        do{
            System.out.println("donner un numéro entre 1 et 10 : ");
            nb = scanner.nextInt();
            if (nb < 1 || nb >10){
                System.out.println("Veillez  saisir un nombre entre 1 et 10 SVP : " + nb);

            }
        }while(nb < 1 || nb >10);
        System.out.println("Vous avez saisi : " + nb);
        scanner.close();
    }
}
