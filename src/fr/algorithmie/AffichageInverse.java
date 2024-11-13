package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for(int intArray : array){
            System.out.println(intArray);
        }

        System.out.println("----------------------");
        System.out.println("--les élémentsde array  dans l’ordre inverse --");

        for (int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

        System.out.println("----------------------");
        System.out.println("--arrayCopy avec une copie tous les éléments de array--");

        int[] arrayCopy = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[i];
            System.out.println(arrayCopy[i]);

        }
    }
}
