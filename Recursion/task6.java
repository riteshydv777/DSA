// fibonacci series

import java.util.*;
public class task6 {

    public static int fib(int n){
        if(n <= 1) return n ;
        else return fib(n-2)+fib(n-1) ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();

        System.out.println( fib(n));
    }
}
