// find digit frequency

import java.util.*;
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        System.out.println("enter digit :");
        int d = sc.nextInt();

        int fre = getFrequency(n,d);
        System.out.println(fre);
    }

    // function to get frequency
    public static int getFrequency(int n , int d){
        int rv = 0 ;
        while(n != 0){
            int dig = n % 10 ;
            n = n / 10 ;
            if(dig == d){
                rv++ ;
            }
        }
        return rv ;
    }
}
