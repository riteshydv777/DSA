// sort color --> leetcode 75
// sort an array of 0's , 1's , and 2's .

import java.util.*;
public class task14 {

    // optimal solution
    public static void swapArray(int[]arr){
        int low = 0 ;
        int mid = 0 ;
        int high = arr.length - 1 ;
        
        while(mid <= high){
             // case 1 :
        if(arr[mid] == 0){
            swap(low,mid, arr);
            low++ ;
            mid++ ;
        }else if(arr[mid] == 1){   // case 2 :
            mid++ ;
        }else{                     // case 3 :
            swap(mid, high, arr);
            high-- ;
        }
        }

    }

    // better solution -- using loops
    public static void sort(int[]arr){
        int count0 = 0 ;
        int count1 = 0 ;
        int count2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) count0++ ;
            else if(arr[i] == 1) count1++ ;
            else count2++ ;
        }

        for(int i = 0 ; i < count0 ; i++){
            arr[i] = 0 ;
        }
        for(int i = count0 ; i < count0 + count1 ; i++){
            arr[i] = 1 ;
        }
        for(int i = count0 + count1 ; i < arr.length ; i++){
            arr[i] = 2 ;
        }
    }

    // swap()
    public static void swap(int i , int j , int[]arr){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    // display()
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int n = sc.nextInt();
        // declare an array
        int[]arr = new int[n] ;
        // take user inuput
        System.out.println("enter the element :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display
        System.out.println("your array is :");
        display(arr);
        // System.out.println("\n"+"after sorting :");
        // sort(arr);
        // display(arr);
        System.out.println();
        swapArray(arr);
        display(arr);



        
      
    }
}
