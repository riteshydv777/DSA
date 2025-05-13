// prime number.
// find particular number is prime or not.

import java.util.*;
public class ques1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of number:");
        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
          System.out.println("enter number:");
          int n = sc.nextInt();
          
          int count = 0 ;
          for(int div = 1 ; div <= n ; div++){
              if(n%div == 0){
                count++ ;
              }
          }
          if(count==2){
            System.out.println(n+ "is prime");
          }else{
            System.out.println(n+ "is not prime");
          }
        }
    }
}
