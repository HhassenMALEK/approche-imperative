package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nb;
        int[] array = new int[10];
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            int count;
            System.out.print("donner un nombre : ");

            nb = scanner.nextInt();
            array[i] = nb;
            count = 9 - i;
            if(max < array[i]){
                max = array[i];
            }
            System.out.println(" ");
            System.out.println("     ---------      ");
            if(count == 0){
                System.out.println("vous n'avez plus de nombre à sasir");
            }else if(count == 1){
                System.out.println("il vous reste un seul nombre à sasir");
            }else {
                    System.out.println("il vous reste " + count + " nombres  à sasir");
            }
        }

        System.out.print("Les nombres saisis sont :");
        for (int nombre : array) {
            System.out.print(nombre + " ");
            System.out.print(" ");


        }
        System.out.println(" ");
        System.out.print("le plus grand de ces nombres est: " + max);


    }
}
