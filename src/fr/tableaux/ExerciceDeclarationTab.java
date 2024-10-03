package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main (String[] args){
        int [] intArray = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println("l’élément du tableau d’index 0 du tableau est :" + intArray[0]);

        System.out.println("le tableau contient  est de: " + intArray.length + " cases.");

        System.out.println("l’entier positionné au dernier index du tableau " + intArray[intArray.length-1]);

        System.out.println("l’élément du tableau d’index 10 du tableau est :" + intArray[10]);
        // le programe a echoué parceque on lui demande d'afficher l'émélment de l'index 10  qui n'existe pas dans le tableau .intArray contient que 8 elements;

    }
}
