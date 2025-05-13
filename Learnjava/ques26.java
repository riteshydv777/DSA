// Broken economy problem.  in array
// ceil and floor 


import java.util.*;
public class ques26 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        // create an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the vale in array:");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // find ceil and floor.

        int low = 0 ; 
        int high = arr.length-1 ;
        System.out.println("\n"+"data you want :");
        int data = sc.nextInt();
        int ceil = 0 ;
        int floor = 0 ;
         while(low <= high){
            int mid = (low + high) / 2 ;
            
            if(data < arr[mid] ){
                high = mid - 1 ;
                ceil = arr[mid] ;
            }else if(data > arr[mid] ){
                low = mid + 1 ;
                floor = arr[mid] ;
            }else{
                ceil = arr[mid] ;
                floor = arr[mid] ;
                break;
            }

         }
         System.out.println("floor is :" +floor);
         System.out.println("ceil is :" +ceil);
          
    }
}
