// npr = n!/(n-r)! .

// import java.util.*;
// public class ques12 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter value of n : ");
//         int n = sc.nextInt();
//         System.out.println("enter the value of r : ");
//         int r = sc.nextInt();

//         // n! = n*(n-1)*(n-2)*(n-3)*.....*1
//         int nfact = 1 ;
//         for(int i = 1 ; i <= n ; i++){
//             nfact = nfact * i ;
//         }
//         // (n-r)! = (n-r)*(n-r-1)*(n-r-2)*.....*1
//         int nmrfact = 1 ;
//         for(int i =1 ; i <= n-r ; i++){
//             nmrfact = nmrfact * i ;
//         }
        
//         // npr = nfact / nmrfact .
//         int npr = nfact / nmrfact ; 
//         System.out.println(n+ "p" +r+ " = " +npr);

//     }
// }

//  using function . 

import java.util.*;
public class ques12{

    // function for factorial .

    public static int fact(int x){
        int  rv = 1 ;
        for(int i = 1 ; i <= x ; i++){
            rv = rv * i ;
        }
        return rv ;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("enter the value of r : ");
        int r = sc.nextInt();

        int nfact = fact(n) ;
        int nmrfact = fact(n-r);
        int npr = nfact / nmrfact ; 
        System.out.println(n+ "p" +r+ "=" +npr);

        }
        
    }
