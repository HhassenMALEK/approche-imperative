package fr.algorithmie;
import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nb;
        do{
            System.out.println("Sasir un entier entre 1 et 10: ");
            nb = scanner.nextInt();
        }while(nb < 1 || nb > 10);
        System.out.println ("Vous avez saisi : " + nb);

        System.out.println("les 10 nombre suivants le chiffre choisie " + nb + " sont: ");
        for (int i = 1; i <= 10; i++){
            System.out.print(nb + i +" ");
        }

    }

}
