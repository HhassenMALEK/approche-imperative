package fr.algorithmie;

public class Rotation {
    public static void main (String[] args){

        int[] array = {0,1,2,3};
        int reserve1 = array[0];
        array[0]= array[array.length-1];

        for (int i = 1 ; i < array.length; i++){
            int reserve2 = array[i];
            array[i] = reserve1;
            reserve1 =reserve2;
         }

        for(int intArray : array) {
            System.out.print(intArray + " ");
        }
    }
}
