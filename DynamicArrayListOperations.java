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

public class DynamicArrayListOperations {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        // Insert 20 random integers (including duplicates)
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100)); // Random integers between 0 and 99
        }
        System.out.println("Initial ArrayList with random integers: " + list);

        // Insert an element at the beginning of the ArrayList
        list.add(0, 999);  // Add 999 at the beginning
        System.out.println("After inserting 999 at the beginning: " + list);

        // Insert an element at the middle index
        int middleIndex = list.size() / 2;
        list.add(middleIndex, 555);  // Add 555 at the middle index
        System.out.println("After inserting 555 at the middle index: " + list);

        // Insert an element at the last index
        list.add(list.size(), 888);  // Add 888 at the end
        System.out.println("After inserting 888 at the last index: " + list);

        // Remove the middle value
        list.remove(middleIndex);  // Remove the element at the middle index
        System.out.println("After removing the element at the middle index: " + list);

        // Remove the last value
        list.remove(list.size() - 1);  // Remove the last element
        System.out.println("After removing the last element: " + list);

        // Remove all duplicate values
        removeDuplicates(list);
        System.out.println("After removing all duplicate values: " + list);
    }

    // Method to remove duplicate values from the ArrayList
    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();  // Create a new list to hold unique values

        for (Integer value : list) {
            if (!uniqueList.contains(value)) {  // If the value is not already in uniqueList, add it
                uniqueList.add(value);
            }
        }

        // Clear the original list and add all unique elements back
        list.clear();
        list.addAll(uniqueList);
    }
}

