
// First Non-Repeating Character
// aabbcdd -- c

import java.util.*;

public class string7 {
    public static void main(String[] args) {
        String str = "aabbcdeff" ;

        str = str.toLowerCase();

        // part 1 : create freq array
        int[]freq = new int[26];

        // part 2 : count the frequency
        for(int i = 0 ; i <= str.length() - 1 ; i++){
            freq[str.charAt(i) - 'a']++;
        }

        // part 3 : find first non repeating
        for(int i = 0 ; i <= str.length()-1 ; i++){
            if(freq[str.charAt(i) - 'a'] == 1){
                System.out.println("first non repeating : " +str.charAt(i));
                return ;
            }
        }

        System.out.println("No non-repeating character");
    }
}
