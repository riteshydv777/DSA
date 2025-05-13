// Subarray of an array.
/*
 *  a b c  --> a
 *             a b 
 *             a b c
 *             b
 *             b c
 *             c
 * 
 */
import java.util.*;
public class ques24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // for subarray.
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+ "\t");
                }
                System.out.println();
            }
        }
    }
}
