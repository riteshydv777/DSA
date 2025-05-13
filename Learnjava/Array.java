
import java.util.*;
public class Array {
    public static void main(String[]args){
        // declare an array .
        int[]arr = new int[5] ; 
        arr[0] = 98 ;
        arr[1] = 99 ;
        arr[2] = 95 ;
        arr[3] = 89 ;
        arr[4] = 88 ;
        
        
        // display an ARRAY .

           System.out.println("your array is : ");
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }    

        // declare an array for marks using user input.

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size : ");
        int n = sc.nextInt();
        // declare an array

        int[]marks = new int[n] ; 
        
        // take user input.
        System.out.println("Take input from user : ");

        for(int i = 0 ; i < arr.length ; i++){
           marks[i] = sc.nextInt();    
        }
        
 

        // Display an marks array.
        System.out.println("your marks array is : ");

        for(int i = 0 ; i < marks.length ; i++){
            System.out.println(marks[i]);
        }

    }
}
