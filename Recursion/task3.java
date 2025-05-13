// sum of n natural number

import java.util.*;
public class task3 {

    // sum using recursion
    public static int sum1(int n){
        if(n == 0) return 0 ;
        else return sum1(n-1)+n ;
    }

    // sum using formula
    public static int sum2(int n){
        return n*(n+1)/2 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        
        // sum using recursion
        System.out.println(sum1(n));

        // sum using formula
        System.out.println(sum2(n));
    }
}
