// Subsets of an Array

 import java.util.*;
public class task9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n] ;
        //take user input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        
        System.out.println();

        int limit = (int)Math.pow(2,arr.length);

        for(int i = 0 ; i < limit ; i++){
            String set = "";
            int temp = i ;

            for(int j = arr.length - 1 ; j >= 0 ; j--){
                int r = temp % 2 ;
                temp = temp / 2 ;

                if(r == 0){
                    set = "-" +"\t"+ set ;
                }else{
                    set = arr[j] + "\t" + set ;
                }
            }
              System.out.println(set);
        }
             //System.out.println(set);
    }
}    