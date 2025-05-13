// difference of two array.
// Ther are problem in this code

import java.util.*;
public class ques20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // first array.
        System.out.println("enter the size of a1 array : ");
        int n1 = sc.nextInt();
        int[]a1 = new int[n1];
        // user input in a1
        System.out.println("enter the value in a1 :");
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = sc.nextInt();
        }

        // second array.
        System.out.println("enter the size of a2 array :");
        int n2 = sc.nextInt();
        int[]a2 = new int[n2];
        // take user input in a2
        System.out.println("enter the value in a2 :");
        for(int i = 0 ; i < a2.length ; i++){
            a2[i] = sc.nextInt();
        } 

        // create an array for difference
        int[]diff = new int[n1 > n2 ? n1 : n2];

        int c = 0 ;
        int i = a1.length - 1 ;
        int j = a2.length - 1 ;
        int k = diff.length - 1 ;

        while( k >= 0 ){
            int d = 0 ;
            int a1v = (i >= 0 ? a1[i] : 0);
            
            if(a2[j]+c >= a1[i]){
                d = a2[j]+c - a1v;
                c = 0 ;
            }else{
                d = a2[j] + 10 + c - a1v ;
                c = -1 ;
            }
            diff[k] = d ;
            i-- ;
            j-- ;
            k-- ;
        }
        int idx = 0 ;
        while(idx < diff.length && diff[idx] == 0){
            idx++ ;
        }
        while(idx < diff.length){
            System.out.println(diff[idx++]);
        }

    }
}
