// display array in reverse
import java.util.*;
public class task11 {
    public static void displayRev(int[]arr , int idx){
        if(idx == arr.length) return ;// base case
        displayRev(arr, idx+1);       // recursive call.
        System.out.println(arr[idx]); // print.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        // declare array
        int[]arr = new int[n] ;
        //take user inpute
        System.out.println("enter data : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        // call dislayRev()
        System.out.println("your array in reverse : ");
        displayRev(arr,0);
    }
}
