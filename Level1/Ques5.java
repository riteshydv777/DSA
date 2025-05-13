// Count digits in a number .
// 456 --> 3 digits

import java.util.*;
public class Ques5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        int digit = 0 ;
        while(n != 0){
            n = n/10 ;
            digit++ ;
        }
        System.out.println("digit in given number is:"  +digit);
    }    
}
