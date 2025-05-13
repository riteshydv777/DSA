// reverse an array.

import java.util.*;
public class task26 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // decelare an arrray .
        int[]arr = new int[n];
        // tak user input.
        System.out.println("enter the number : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // call reeverse()
        reverse(arr);

    }
    public static void reverse(int[]a){
        int i = 0 ;
        int j = a.length - 1 ;

        while (i < j) {
            int temp = a[i] ; 
            a[i] = a[j] ; 
            a[j] = temp ;

            i++ ;
            j-- ;
        }
    // display reversd array.
    System.out.println("\n"+"your reversed array is : ");
    for(int k = 0 ; k < a.length ; k++){
        System.out.print(a[k]+"\t");
    }
        
    }

}
