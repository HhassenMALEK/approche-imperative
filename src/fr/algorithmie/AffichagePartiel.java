package fr.algorithmie;

public class AffichagePartiel {
    public static void main (String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

       System.out.println("les entiers supérieurs à 3");
        for(int intArray : array){
            if(intArray > 3){
                System.out.println(intArray);
            }
        }
        System.out.println("---------------------------");
        System.out.println("les nombres pairs sont :");
        for(int intArray : array){
            if (intArray % 2 == 0){
                System.out.println(intArray);
            }
        }

        System.out.println("---------------------------");
        System.out.println("les valeurs correspondan aux index pairs sont :");
        for(int i = 0; i <= array.length; i++){
            if (i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        System.out.println("---------------------------");
        System.out.println("les nombres impairs sont :");
        for(int intArray : array){
            if (intArray % 2 != 0){
                System.out.println(intArray);
            }
        }


    }
}
