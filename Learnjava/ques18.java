// Bar chart. --> asteriks representing value of an array.
// eg --> arrar = 1234
//       *
//     * *
//   * * *
// * * * *
import java.util.*;
public class ques18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();

        // declare an array.
        int[]arr = new int[n];
        // take user inpute in array.
        System.out.println("enter the element in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // find maximum in array.
        int max = arr[0] ; 
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ; 
            }
        }
        System.out.println("maximum element in array is " + max);
        
        for(int floor = max ; floor >= 1 ; floor--){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        // System.out.println();
    }
}
