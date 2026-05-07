// reverse a string 
// abcd ---> dcba

import java.util.*;

public class string1 {

    // reverseString().....
    public static String reverseString(String str){
        String rev = "";
        for(int i = str.length()-1 ; i >=0 ; i--){
            rev = rev + str.charAt(i);
        }
        return rev ;
    }
    public static void main(String[]args){
        // take user inpute
        System.out.println("enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // display your string
        System.out.println("your string is : ");
        System.out.println(str);
        
        // reverse a string

        String rev = reverseString(str);
        System.out.println(rev);

    }
}
