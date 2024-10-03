package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        for (int intArray : array) {
            if (intArray > 3) {
                System.out.println(intArray + "est supérieur à 3");
            }
        }

        for (int intArray : array) {
            if (intArray % 2 == 0 ) {
                System.out.println(intArray + "est un nombre pair");
            }
        }

        for (int i = 0; i < array.length; i++) {
            if ( i % 2 == 0 ) {
                System.out.println( "la valeurs des index pairs " + i + " est " + array[i]);
            }
        }

        for (int intArray : array) {
            if (intArray % 2 != 0 ) {
                System.out.println(intArray + "est un nombre impair");
            }
        }


    }
}