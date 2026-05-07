// move even at beginning and odd at end
// sort priority

import java.util.*;

public class Array4 {

      // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ssize of an array :");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n];

        System.out.println("enter the element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display()....
        System.out.println("your array is : ");
        display(arr);

        // sort : even first the odd

        int i = 0 ;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0){
                // swap(i,j)
                int temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp ;
                i++;
                j--;
            }

            if(arr[i] % 2 == 0){
                i++;
            }

            if(arr[j] % 2 == 1){
                j--;
            }
        }

        System.out.println("\n"+"after sorting :");
        display(arr);

    }
}
