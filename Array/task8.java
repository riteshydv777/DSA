// find element position in array.
// last index of occurence without recursion.

import java.util.*;
public class task8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n] ;
        //take user input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }   

        // find element position.
        
        System.out.println("\n"+"enter the data :");
        int data = sc.nextInt() ;
        int indx = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == data){
                indx = i ;
                //break ; 
            }

        }
        System.out.println(" last index value is :" +indx  );
    }
}    
