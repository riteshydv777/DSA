// last index of occurence in array usin recursion.
// find element position in array

import java.util.*;
public class task7 {
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
        System.out.println("\n"+"enter the data :");
        int data = sc.nextInt();

        System.out.println("\n"+ "last index of " +data+ " is");

        int li = lastIndex(arr,0,data);
        System.out.println(li);
        
    }
    public static int lastIndex(int[]arr , int indx , int x){
        if(indx == arr.length){
            return -1 ;
        }

        int liisa = lastIndex(arr , indx+1 , x);
        
        if(liisa == -1){
            if(arr[indx] == x){
                return indx ;
            }else{
                return -1 ;
            }
        }else{
            return liisa ;
        }

    }
}         