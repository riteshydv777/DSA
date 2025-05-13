// Last index of occurrence

import java.util.*;
public class task15 {

    // last index of occurrence
    public static int li(int[]arr , int idx , int x){
        
        if(idx == arr.length) return -1 ;  // base case.

        int liisa = li(arr , idx+1 , x);   // recursive call.
        if(liisa == -1){                   // Means , 1 to end data not present.
            if(arr[idx] == x) return idx ; // check 0th idx if data present then return idx = 0.
            else return -1 ;               // check 0th idx if data not present then return idx = -1. 
        }else{
            return liisa ;                 // Means , 1 to end data is present.
        }
    }

    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        // declare array
        int[]arr = new int[n] ;
        //take user inpute
        System.out.println("enter data : "+" ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("your array is : ");
        display(arr);

        // data 
        System.out.println("\n"+"enter data : ");
        int d = sc.nextInt();

        System.out.println("last index is : "+li(arr, 0, d));

    }
}
