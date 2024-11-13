package fr.algorithmie;

public class CalculMoyenne {
    public static void main (String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int sumArray = array[0];
        for (int i = 1; i < array.length; i++){
            sumArray += array[i];
        }
        double averageSumArray = sumArray / array.length;
        System.out.println("la moyenne des éléments du tableau est: " + averageSumArray);

    }
}
