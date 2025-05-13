// print all prime number between given range

import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter low :");
        int low = sc.nextInt();
        System.out.println("enter high :");
        int high = sc.nextInt();

        System.out.println("prime number between given range :");
        for(int n = low ; n <= high ; n++){
            int count = 0 ;
            for(int div = 2 ; div*div <= n ; div++){
                if(n % div == 0){
                    count++ ;
                    break ;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}
