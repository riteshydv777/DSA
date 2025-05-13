// factorial of a number. eg --> 5! = 5*4*3*2*1

import java.util.*;
public class task4 {

    public static int fact(int n){
        if(n == 0) return 1 ;
        else return fact(n-1)*n ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
