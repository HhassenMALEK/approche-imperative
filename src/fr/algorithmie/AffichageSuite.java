package fr.algorithmie;

public class AffichageSuite {
    public static void main (String[]  args){
        for (int i = 1; i <= 10; i++){
            System.out.println( i );
        }

        System.out.println( "______________________________");
        for (int i = 0; i <= 10; i++){
            if(i % 2 == 0) {
                System.out.println(i + " est un nombre pair");
            }
        }

        System.out.println( "______________________________");


        for (int i = 0; i <= 9; i++){
            if(i % 2 != 0) {
                System.out.println(i + " est un nombre impair");
            }
        }

        System.out.println( "______________________________");
        System.out.println( "Boucles While");

        int i = 1;
        while(i <=10){
           System.out.println(i);
           i++;
        }
        int j = 0;
        while(j <= 10) {
            if(j % 2 ==0) {
                System.out.println(j + " est un nombre pair");
            }
              j++;
        }

        System.out.println( "______________________________");

        int k = 0;
        while(k <= 9) {
            if(k % 2 !=0) {
                System.out.println(k+ " est un nombre impair");
            }
            k++;
        }

    }
}
