
import java.util.*;
public class sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        // calculate sum
    //     int sum = 0 ;
    //     for(int i = 1 ; i <= n ; i++){
    //         sum = sum + i ;
    //     }
    //     System.out.println("sum is : "+sum);
    //
        int sum = n*(n+1)/2 ;
        System.out.println(sum); 
    }
}
