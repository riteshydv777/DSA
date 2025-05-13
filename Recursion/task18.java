// get keyad combination
// 678 : 6 --> 
//     : 78 --> tv , tw , tx , uv , uw , ux .

import java.util.*;
public class task18 {
    
    static String[] codes = {",;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    // getKPC()
    public static ArrayList<String> getKPC(String str){
        // base case
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres ;
        }
        //  eg --> 678 --> 6 78
        char ch = str.charAt(0) ; // 6
        String ros = str.substring(1); // 78

        // recursive call 
        ArrayList<String> rres = getKPC(ros) ; // 6 words   
        ArrayList<String> mres = new ArrayList<>(); // 24 words 

        String codeforch = codes[ch - '0'] ;
        for(int i = 0 ; i < codeforch.length() ; i++){
            char chcode = codeforch.charAt(i) ;
            for(String rstr : rres){
                mres.add(chcode +rstr);
            }
        }        
        return mres ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
}
