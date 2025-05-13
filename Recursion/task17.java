// get subsequence

import java.util.*;
public class task17 {
    
    // bc --> [-- , -c , ]
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres ;
        }

        char ch = str.charAt(0);  // a
        String ros = str.substring(1);  // bc
        ArrayList<String> rres = gss(ros) ; // gss(bc) --> recursive call --> [-- , -c , b- , bc]
        
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr : rres){
            mres.add(" "+rstr);
        }
        for(String rstr : rres){
            mres.add(ch +rstr);
        }

        return mres ;

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();

        // declare arraylist
        ArrayList<String> res = gss(str);
        System.out.println(res);
        
    }
}
