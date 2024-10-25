    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

//    package com.mycompany.arrayinjava;
    import java.util.Arrays;
    import java.util.Scanner;
    /**
     *
     * @author Mubi
     */
    public class Arrayinjava {

        public static int LinearSearch(int arr[],  int target){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }

        public static int binarySearch(int arr[],  int target){
            int left = 0;
            int right = arr.length -1;
            while(left <= right){
                int mid = left + (right - left)/2;

                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid -1;

                }

            }
            return -1;

        } 



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for(int i = 0; i < n; i++){
               arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target value: ");
            int target = sc.nextInt();
            
            Arrays.sort(arr);
            System.out.println("Linear Search Result: " + LinearSearch(arr, target));
            Arrays.sort(arr);
            System.out.println("Linear Binary Result: " + binarySearch(arr, target));
        }
    }
