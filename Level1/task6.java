// reverse a number
// 456 = 654

import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();

        while(n != 0){
            int digit = n % 10 ;
             n = n / 10 ;
             System.out.println(digit);
        }
    }
}
