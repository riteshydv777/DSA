// print number of digits
// eg - 456 = 3 

import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();

        int digit = 0 ;
        while(n != 0){
            n = n/10 ;
            digit++ ;
        }
        System.out.println(digit);
    }
}
