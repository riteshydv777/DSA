// Find maximum of array
import java.util.*;
public class task12 {

    public static int max(int[]arr,int idx){
        if(idx == arr.length - 1) return arr[idx] ; // base case

        int misa = max(arr, idx+1);    // recursive call
        if(misa > arr[idx]) return misa ; // checks 
        else return arr[idx] ;
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

        // call max()
        System.out.print("maximum element is : ");
        int ans = max(arr,0);
        System.out.println(ans);
    }
}
