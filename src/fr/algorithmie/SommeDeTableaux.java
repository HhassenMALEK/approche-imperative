package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String [] args){

        int[] firstArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int [] secondArray = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int [] newArray = new int [firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++){
            newArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++){
            newArray[firstArray.length+i] = secondArray[i];
        }
        System.out.println(" les elements du nouveau tableau newArray qui fusionne les deux tableaux." );
        for (int intArray : newArray) {
            System.out.print(intArray + " ");

        }

        int sumNewArray = newArray[0];
        for (int i = 1; i < newArray.length; i++){
            sumNewArray = sumNewArray + newArray[i];
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------------- ");
        System.out.println("la somme des elements de newArray : " + sumNewArray);




    }
}
