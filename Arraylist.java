/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mubi
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Arraylist {
    
    //Method to generate random integers and add them into Arraylist
    //The ArrayList<Integer> is used when you need a dynamic list of integers
    public static void insertRandomINtegers(ArrayList<Integer> list, int numberOfElements){
        Random rand = new Random();
        for(int i = 0; i < numberOfElements; i++){
            list.add(rand.nextInt(100)); // Generates a random integer between 0 and 99
        }
    }
    
    // Method to sort the ArrayList using Collections.sort()
    public static void sortArrayList(ArrayList<Integer> list){
        Collections.sort(list);  // Sorts the list in ascending order
        System.out.println("SOrted list: " + list);
        
    }
    
    //// Method to perform binary search on the sorted ArrayList
    public static void binarySearch(ArrayList<Integer> list, int target){
        //Collections.binarySearch(list, target) is a convenient way to search for a specific value in a sorted list. It uses the efficient binary search algorithm provided by Java's Collections framework.
        int index = Collections.binarySearch(list, target); 
        
        if(index >= 0){
            System.out.println("ELeement " + target + " is found at " + index);
        }else{
            System.out.println("ELeement " + target + " not found.");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList<>();
        
        // Insert 20 random integers into the ArrayList
        insertRandomINtegers(list, 20);
        
        System.out.println("Unsorted list: " + list);
        
        // Sort the ArrayList
        sortArrayList(list);
        
        Random rand = new Random();
        int target = rand.nextInt(100);  // Generates a random number to search for
        System.out.println("Searching for: " + target);
        
        binarySearch(list, target);
        
    }
    
}
