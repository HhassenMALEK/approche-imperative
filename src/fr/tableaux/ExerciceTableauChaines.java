package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main (String[] args){
        String [] cityName = {"London", "Amesterdam", "Paris", "Madrid", "Rome"};
        for(String city : cityName){
            System.out.println(city);
        }
        System.out.println("le tableau contient  est de: " + cityName.length + " cases.");
        cityName[3] = "Reims";
        for(String city : cityName) {
            System.out.println(city);
        }
    }
}
