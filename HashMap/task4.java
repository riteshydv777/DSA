// Longest consecutive sequence of array
// i/p : 10 , 5 , 9 , 1 , 11 , 8 , 6 , 15 , 3 , 12 , 2
// o/p : 8 , 9 , 10 , 11 , 12

import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n] ;

        // take user input
        System.out.println("enter the value : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display array
        System.out.println("your array is : ");
        display(arr);
        System.out.println();
        System.out.println("longest consecutive sequence is : ");
        longestConsecutive(arr);

    }

    // longest consecutive sequence
    public static void longestConsecutive(int[]arr){

        // declare HashMap
        HashMap<Integer , Boolean> map = new HashMap<>();

        // traver array element and take true for individual integer in hashmap
        for(int val : arr){
            map.put(val,true);
        }
        // again traverse array element and check : 
        for(int val : arr){
           if(map.containsKey(val - 1)){
                map.put(val , false);
           }
        }

        // main logic
        int msp = 0 ;
        int ml = 0 ;
        for(int val : arr){
            int tl = 1 ;
            int tsp = val ;
            while(map.containsKey(tsp + tl)){
                tl++ ;
            }
            if(tl > ml){
                msp = tsp ;
                ml = tl ;
            }
        }

        // display
        for(int i = 0 ; i < ml ; i++){
            System.out.print(msp + i +" ");
        }
    }
    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
