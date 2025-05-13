 
// Display array in reverse .

import java.util.*;
 

public class proj11{
    public static void main(String []args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        displayReverse(arr,0);
    }
    public static void displayReverse(int[]arr, int indx){

        if(indx==arr.length){
            return ;
        }
          displayReverse(arr , indx+1);
          System.out.println(arr[indx]);

    }
}
