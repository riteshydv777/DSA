
// Remove duplicate characters
// hello --- helo

import java.util.*;

public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        //ans
        String ans = "" ;
        // display your string
        System.out.println("your original string is :");
        System.out.println(str);

        // logic for removing the duplicate character
        for(int i = 0 ; i <= str.length()-1 ; i++){
            char ch = str.charAt(i);

            // if ch are not in ans
            if(ans.indexOf(ch) == -1){
                ans = ans + ch ;
            }

        }

        System.out.println(ans);
    }
}
