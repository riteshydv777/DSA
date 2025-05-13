// check the given array is sorted or not.


import java.util.*;
public class task17{

    public static int frequency(int[]arr , int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++ ; 
            }
        }
        return count ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array. 
        int[]arr = new int[n];
        //take use input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"is sorted : "+isSorted(arr));
    }

    public static boolean isSorted(int[]arr){
        boolean check = true ;
        for(int i = 1 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i+1]){
                check = false;
                break;
            } 
        }
        return check ;
    }
}        
