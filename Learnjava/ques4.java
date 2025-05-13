// count digit in anumber
//eg - 456 --> 3 digits

import java.util.*;
public class ques4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int dig = 0 ;
        while( n!= 0){
            n = n / 10 ;
            dig++ ;
        }
        System.out.println("digits in given number is :" +dig);
    }
}
