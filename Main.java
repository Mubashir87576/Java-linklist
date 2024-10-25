/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mubi
 */

class DynamicArray{
    private int[] data;
    private int size;
    
    //constructor to initialize a array with given capacity
    public DynamicArray(int capacity){
        data = new int[capacity];
        size = 0;
    }
    
    //Method to insert an elemnt dyanmically
    public void insert(int element){
        //if the array is full resize it
        if(size == data.length){
            resize();
        }
        //insert the variable at the next variable
        data[size] = element;
        size++;
    }
    
    //Method to resize the array whenits full
    private void resize(){
        int[] newData = new int[data.length * 2]; //double the length
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    
    //Method to remove an array at a given index
    public void remove(int index){
        if(index < 0 || index >= size){
            System.out.println("Index out of Bound");
        }
        //shift element left
        for(int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        size--;
    }
    
    //Method to find an elemnt at a given index
    public int indexOf(int element){
        for(int i = 0; i < size; i++){
            if(data[i] == element){
                return i;
            }
        }
        return -1;
    }
    
    //Method to update a value at a given index
    public void update(int index, int newValue){
         if(index < 0 || index >= size){
            System.out.println("Index out of Bound");
        }
         
         data[index] = newValue;
    }
    
    //Method to display the elemts of dynamic array
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.println(data[i]+ " ");
        }
    }
    
    //to get the current size of array
    public int getSize(){
        return size;
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        DynamicArray ar = new DynamicArray(10);
        
        //insert elements
        ar.insert(85);
        ar.insert(56);
        ar.insert(19);
        ar.insert(78);
        System.out.println("Array after inserting elements: ");
        ar.display();
    
        //remove element at index 2
        ar.remove(2);
        System.out.println("Array after remove a element at index 2");
        ar.display();
        
        //Find the index of elememt 78
        int index = ar.indexOf(78);
        System.out.println("Index of element 78: " + index);
        
        //update element at index 1
        ar.update(1, 22);
        System.out.println("Array after updating element at index 1: ");
        ar.display();
        
         // Insert more elements beyond the initial size
        ar.insert(50);
        ar.insert(60);
        ar.insert(70);
        ar.insert(80);
        ar.insert(90);
        ar.insert(100);
        ar.insert(110);  // This will trigger resizing
        System.out.println("Array after inserting more elements (with resizing):");
        ar.display();
    }
    
}
