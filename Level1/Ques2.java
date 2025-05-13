//Prime number -> number divided by 1 or itself .

import java.util.*;
public class Ques2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range for prime number you want:");
        int r = sc.nextInt();
         
        for(int i = 0 ; i < r ; i++){
            System.out.println("enter the number :");
            int n = sc.nextInt();
            
            // Approach.
            int count = 0 ;
            for(int div = 1 ; div <= n ; div++){
                if(n % div == 0){
                    count++ ;
                }
            }

            if(count == 2){
                System.out.println( n+" number is prime:");
            }else{
                System.out.println( n+" number is not prime:");
            }
        

        }
    }
}
