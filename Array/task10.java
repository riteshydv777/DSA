
import java.util.*;
public class task10 {
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
        System.out.println("\n"+"enter the k : ");
        int k = sc.nextInt() ;
        System.out.println("your rotated array is : ");
        rotate(arr , k ) ;
        display(arr) ;
    }
  

    public static void reverse(int[]arr , int i , int j){
        int li = i ;
        int ri = j ;
        while(li <= ri){
            //swap.
            int temp = i ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            li++ ;
            ri-- ;
        }

    }
     public static void rotate(int[]arr , int k){
        k = k % arr.length ;
        if(k < 0){
        k = k + arr.length ;
        }
        // part 1 .
            
        reverse(arr , 0 , arr.length - k - 1) ;
            
        // part 2 .

        reverse(arr , arr.length - k , arr.length - 1) ;
             
        // all .

        reverse(arr , 0 ,arr.length - 1) ;

         
     }
        
    

    public static void display(int[]arr){

       for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
     }   
}          