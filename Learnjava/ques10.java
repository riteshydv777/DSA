// Prime Factorization of a number.

import java.util.*;
public class ques10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(int div = 2; div*div <= n ; div++){
            while( n % div == 0){
                n = n / div ;
                System.out.println(div+ " ");
            }
        }
        if( n!=0){
            System.out.println(n);
        }
    }
}
