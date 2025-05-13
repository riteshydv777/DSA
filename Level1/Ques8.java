//Inverse of a number.

import java.util.*;
public class Ques8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbeer:");
        int n = sc.nextInt();

        int inv = 0 ;
        int op = 1 ;    // original place.
        
        while(n !=0 ){
            int od = n % 10 ;  // Original digit.
            int id = op ;      // inverted digit.
            int ip = od ;      // inverted place.

            inv = inv + id * (int)Math.pow(10,ip-1);
            n = n/10 ;
            op++ ;
        }
        System.out.println("inverse of given number is : " +inv);
    }
}
