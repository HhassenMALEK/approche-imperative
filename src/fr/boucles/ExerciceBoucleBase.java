package fr.boucles;

public class ExerciceBoucleBase {
    public static void main (String[] args){

        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        for(int i = 1; i < 21; i++){
            String myName = "Hassen MALEK";
            System.out.println(i + "-" +myName);
        }

        for(int i = 2; i < 101; i++){
           if ( i % 2 == 0){
            System.out.println(i + " est un nombre pair");
           }
        }

        for(int i = 1; i < 100; i++){
            if ( i % 2 != 0){
                System.out.println(i + " est un nombre impair");
            }
        }

    }
}
