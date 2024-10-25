/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
/**
 *
 * @author Mubi
 */
public class ArrayConcatenation {
    public static void main(String[] args) {
        
        int A[] = {25, 14, 12, 74, 58, 74, 98, 84, 15, 24};
        int B[] = {87, 11, 10, 81, 67, 94, 74, 82, 15, 87};
        
        //String to store result in c
        String[] C = new String[A.length];
        
        for(int i =0; i< A.length;i++){
        
        if(A[i]>B[i]){
            C[i] = A[i] + "." + B[i];
        }else{
            C[i] = B[i] + "." + A[i];
        }
        }
        
        System.out.println("Array A:" + Arrays.toString(A));
        System.out.println("Array B:" + Arrays.toString(B));
        System.out.println("Array C:" + Arrays.toString(C));
        
        
    }
    
}
