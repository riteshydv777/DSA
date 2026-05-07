
// check pallindrome string
// madam --- > pallindrome
// not   --- > not pallindrome

import java.util.*;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();

        // display your string
        System.out.println("your string is : ");
        System.out.println(str);

        // check pallindrome 
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ;i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("pallindrom");
        }else{
            System.out.println("not pallindrom");
        }
    }
}
