// Pythagorean triplets.

import java.util.*;
public class ques11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side a:");
        int a = sc.nextInt();
        System.out.println("enter side b :");
        int b = sc.nextInt();
        System.out.println("enter side c :");
        int c =sc.nextInt();

        // find maximum.
        int max = a ;
        if(b > max){
            max = b ;
        }if(c > max){
            max = c ;
        }

        if(max == a){
            boolean flag = ((b*b) + (c*c)==(a*a));
            System.out.println(flag);
        }
        else if(max == b){
            boolean flag = ((a*a) + (c*c) == (b*b));
            System.out.println(flag);
        }
        else{
            boolean flag = ((a*a)+(b*b) == (c*c));
            System.out.println(flag);
        }
    }
}
