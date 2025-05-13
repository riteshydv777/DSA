
import java.util.*;

public class task18{

    public static int frequency(int[]arr , int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++ ; 
            }
        }
        return count ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array. 
        int[]arr = new int[n];
        //take use input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

         
        System.out.println("\n"+"your sorted array is : ");
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"your smallest and greatest element array is : ");
        int[]ans = smallestandlargest(arr);

        System.out.println("\n"+"smallest " +ans[0]);
        System.out.println("largest " +ans[1]);
        
        display(ans);

    }

    public static int[] smallestandlargest(int[]arr){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        int[]ans = {arr[0] , arr[arr.length - 1]} ; 
        return ans ;
    }

    public static void display(int[]a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
    }
}        