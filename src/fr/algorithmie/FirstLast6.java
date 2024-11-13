package fr.algorithmie;

public class FirstLast6 {
    public static void main (String[] args){

       int [] array = {3, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

       boolean booleanCondition = false;

       for (int i = 0; i < array.length; i++){
           if( array.length >= 1 && array[0] == 6 || array[array.length-1]==6){
             booleanCondition = true;
           }
       }
       System.out.println(booleanCondition);
    }
}
