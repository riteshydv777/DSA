// Reverse of an array.

import java.util.*;
public class ques21 {

    public static void reverse(int[]a){
        int i = 0 ;
        int j = a.length - 1 ;
        while(i < j){
            int temp = a[i] ;
            a[i] = a[j] ; 
            a[j] = temp ;
            i++ ; 
            j-- ;
        }
        for(int k = 0 ; k < a.length ; k++){
            System.out.println(a[k]);
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        //declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("reverse of array is : ");
        reverse(arr);

    }
}
