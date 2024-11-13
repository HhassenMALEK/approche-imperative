package fr.algorithmie;
import java.util.Scanner;

public class InteractifTableMult {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int nb;
        do{
            System.out.println("Donner un numéro entre 1 et 10 :");
            nb = scanner.nextInt();
            if (nb < 1 || nb >10) {
                System.out.println("Veillez  saisir un nombre entre 1 et 10 SVP : " + nb);
            }
        }while( nb < 1 || nb > 10);

        System.out.println("es 10 nombres suivants " + nb + " sont: ");
           for (int i = 1; i <10; i++){
               System.out.println(nb + " * " + i + " = "+ nb * i);
           }
    }
}
