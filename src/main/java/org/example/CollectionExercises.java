package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        String[]fruits = new String[size];
        for (int i = 0; i <size;i++){
            fruits[i]= "apple";}
 return fruits;
        }





    public String[] makeTopThreeArray(String[] fruits) {
    String[] topThree = new String[3];
        for(int i= 0; i < 3; i++){
            topThree[i] = fruits[i];
        } return topThree;
    }



    // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation



    public ArrayList<String> makeFruitList() {
        //Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        return fruits;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String>fruits = new ArrayList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        return fruits;
    }

    public HashMap<String, String> makeFruitMap() {


        HashMap<String,String> fruitcolors= new HashMap<>();
        fruitcolors.put("apple","red");
        fruitcolors.put("banana","yellow");
        fruitcolors.put("cherry","red");
        fruitcolors.put("date", "brown");
        fruitcolors.put("elderberry", "black");


        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        return fruitcolors;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {

        return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {

        HashSet<String>fruitSet= new HashSet<>();

        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);

        return fruitSet;
    }
}
