// first index of occurence in array usin recursion.
// find element position in array

import java.util.*;
public class task6 {
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
        // first index .
        System.out.println("\n"+"enter the data :");
        int data = sc.nextInt();

        System.out.println("\n"+"first index of " +data+ " is :");

        int fi = firstIndex(arr , 0 , data);
        System.out.println(fi);
    }     
    public static int firstIndex(int[]arr, int indx ,int x){

        if(indx==arr.length){
            return -1;
        }
        int fiisa = firstIndex(arr,indx+1,x);
        if(arr[indx]==x){
            return indx;
    }else{
        return fiisa;
    }
}
}
