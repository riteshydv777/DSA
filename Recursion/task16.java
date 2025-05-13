// All indices in array
import java.util.*;
public class task16 {

    // allIndices()
    public static int[] allIndices(int[]arr , int x , int idx , int fsf){
        if(idx == arr.length){
            return new int[fsf] ;
        }
        if(arr[idx] == x){
            int[]iarr = allIndices(arr, x, idx+1, fsf+1) ;
            iarr[fsf] = idx ;
            return iarr ;
        }else{
            int[]iarr = allIndices(arr, x, idx+1, fsf) ;
            return iarr ;
        }
    }
    
    // display()
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        // declare array
        int[]arr = new int[n];
        // take user inpute
        System.out.println("enter data in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        //  display your array.
        System.out.println("your array is :");
        display(arr);

        System.out.println("\n"+"enter data you want : ");
        int x = sc.nextInt();


        // all indices
        int[]iarr = allIndices(arr, x, 0, 0) ;
        display(iarr);
    }
}
