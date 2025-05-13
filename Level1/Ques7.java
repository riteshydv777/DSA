// Reverse a number .

import java.util.*;
public class Ques7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
         
        while(n > 0){
             int dig = n % 10 ;
                  n = n/10 ;
                  System.out.println(dig);
        }
              

    }
}
