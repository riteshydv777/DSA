// prime number 
// input = 5{1 2 3 4 5}
// output = 1 pn , 2pn , 3pn , 4 npn , 5 pn

import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
            System.out.println("enter number :");
            int n = sc.nextInt();

            int count = 0 ;
            for(int div = 2 ; div*div <= n ; div++){
                if(n % div == 0){
                    count++ ;
                    break ;
                }
            }
            
            if(count == 0){
                System.out.println(n+ " is Prime number");
            }else{
                System.out.println(n+ " is not a Prime number");
            }
        }
    }
}
