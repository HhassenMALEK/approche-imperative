package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args){

        int [] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("l'emelent numéro 1 de intArray est :"+ intArray[0]);

        System.out.println("intArray contient :"+ intArray.length + " cases");

        int LastIndex = intArray.length;

        System.out.println("le dernier element du tableau est: "+ intArray[LastIndex - 1]);

        intArray[4] = 8;



    }
}
