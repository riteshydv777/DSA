// sum of two array.

import java.util.*;
public class ques19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // first array
        System.out.println("enter size of a1 array :");
        int n1 = sc.nextInt();
        int[]a1 = new int[n1] ; 
        System.out.println("enter the value ini a1 array : ");
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = sc.nextInt() ; 
        }
        // Second array.
        System.out.println("enter size of a2 array :");
        int n2 = sc.nextInt();
        int[]a2 = new int[n2] ; 
        System.out.println("enter the value in a2 array : ");
        for(int i = 0 ; i < a2.length ; i++){
            a2[i] = sc.nextInt() ; 
        }
        // display your arrays . 
        System.out.println("your first array is : ");
        for(int i = 0 ; i < a1.length ; i++){
            System.out.print(a1[i]+ " \t");
        }
        System.out.println(); 
        System.out.println("your second array is : ");
        for(int i = 0 ; i < a2.length ; i++){
            System.out.print(a2[i]+ " \t");
        }

        // create an array for sum . 
        int[]sum  = new int[n1 > n2 ? n1 : n2];

        int c = 0 ;
        int i = a1.length - 1 ;
        int j = a2.length - 1 ;
        int k = sum.length - 1 ;

        while( k >= 0 ){
            int d = c ; 
            if(i >= 0){
                d = d + a1[i] ; 
            }
            if( j >= 0 ){
                d = d + a2[i] ;
            }

            c = c / 10 ;
            d = d % 10 ;
            sum[k] = d ;
            i-- ; 
            j-- ; 
            k-- ;

        }

        if(c != 0 ){
            System.out.println(c);
        }
        for(int val : sum){
            System.out.println(val);
        }
        
    }
}
