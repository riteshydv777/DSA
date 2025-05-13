
//Display array element using recursion.

//import java.io.*;
import java.util.*;

public class project10 {
      
    public static void main(String [] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i= 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        displayArr(arr , 0);

    }
    public static void displayArr(int [] arr , int indx){

        if(indx == arr.length){
            return;
        }
        System.out.println(arr[indx]);
        displayArr(arr , indx+1);
    }
    
}
