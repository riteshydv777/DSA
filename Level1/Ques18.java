 // Create an array.
 
 // int[]marks = new int[5];

 // marks[0] = 88 ;
 // marks[1] = 90 ;
 // marks[2] = 96 ;
 // marks[3] = 99 ;
 // marks[4] = 95 ;



import java.util.*;
public class Ques18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        // create an array .
        int[]arr = new int[n];
        // take inpute from user in array.
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
        }

    }
}
