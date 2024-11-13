package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nb;


            System.out.println("Donner un nombre plus grand que 1: ");
            nb = scanner.nextInt();
            int sum = 1;
             if(nb > 0 ){
                 for ( int i = 2; i <= nb; i++) {
                     sum += i;
                     System.out.println(sum);
                 }
             }else{
                 for(int i = 0; i >= nb; i--){
                     sum += i;
                     System.out.println(sum);
                 }
             }
    }
}
