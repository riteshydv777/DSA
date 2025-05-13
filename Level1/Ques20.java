//   Find the element in array .
   
import java.util.*;
public class Ques20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :"); 
        int n = sc.nextInt();
        
        // create an array .
        int[]arr = new int[n];
        // take inpute from user in array .
        System.out.println("enter the data in array :");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("enter data you want to find in array :");
        int data = sc.nextInt();  // data you want to find in array
        int idx = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] ==  data){
                idx = i ;
                break ;
            }
        } 
        
        System.out.println("your data is at index " +idx);

    }
}
