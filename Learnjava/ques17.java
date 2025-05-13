// Find element in array.

import java.util.*;
public class ques17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();

        // declare an array.
        int[]arr = new int [n] ; 
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the data you want to find : ");
        int data = sc.nextInt();
        int idx = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] == data){
                idx = i ;
                break ;
            }
        }
        System.out.println(idx);
    }
}
