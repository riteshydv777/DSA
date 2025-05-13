//  npr = n!/(n-r)! . 

import java.util.*;
public class Ques13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        // n! --> n*(n-1)*(n-2)*.....1
        int nfact = 1 ;
        for(int i = 1 ; i <= n ; i++){
            nfact = nfact * i ;
        }
        // (n-r)! --> (n-r-1)*(n-r-2)*(n-r-3)*.....1

        int nmrfact = 1 ;
        for(int i = 1 ; i <= n-r ; i++){
            nmrfact = nmrfact * i ;
        }
        int npr = nfact / nmrfact ;
        System.out.println( n+ "P" +r+ "="+npr);
    }
}
