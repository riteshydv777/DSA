// first index of occurrence

import java.util.*;
public class task14 {

    public static int firstidx(int[]arr , int x){
        int low = 0 ;
        int high = arr.length - 1 ;
        int res = -1 ;

        while(low <= high){
            int mid = low + (high - low)/2 ;

            if(x == arr[mid]){
                res = mid ;
                high = mid - 1 ;
            }else if(x < arr[mid]){
                high = mid - 1 ;
            }else{
                low = mid + 1 ;
            }
        }
        return res ;
        
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

        // your array 
        System.out.println("your array is : ");
        display(arr);

        System.out.println("\n"+"enter data : ");
        int d = sc.nextInt();

        System.out.println(firstidx(arr,d));
    }
}
