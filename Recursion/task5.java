// exponent

import java.util.*;
public class task5 {

    public static int pow(int m , int n){
        if(n == 0) return 1 ;
        else return pow(m , n-1) * m ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m : ");
        int m = sc.nextInt();

        System.out.println("enter n :");
        int n = sc.nextInt();

        System.out.println( pow(m,n));
    }
}
