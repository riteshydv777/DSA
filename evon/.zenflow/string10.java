
// Minimum Window Substring (Leetcode Hard) | Hashmap Interview Questions

import java.util.*;

public class string10 {

    public static String Solution(String s1, String s2) {

        String ans = "";

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();

        int matchCount = 0;
        int dmatchCount = s2.length();

        int i = -1;
        int j = -1;

        while (true) {

            boolean f1 = false;
            boolean f2 = false;

            // acquire
            while (i < s1.length() - 1 && matchCount < dmatchCount) {
                i++;
                char ch = s1.charAt(i);

                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchCount++;
                }

                f1 = true;
            }

            // release
            while (j < i && matchCount == dmatchCount) {

                String pans = s1.substring(j + 1, i + 1);

                if (ans.length() == 0 || pans.length() < ans.length()) {
                    ans = pans;
                }

                j++;
                char ch = s1.charAt(j);

                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }

                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchCount--;
                }

                f2 = true;
            }

            if (!f1 && !f2) {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string s1:");
        String s1 = sc.nextLine();

        System.out.println("Enter string s2:");
        String s2 = sc.nextLine();

        String ans = Solution(s1, s2);

        System.out.println("Minimum Window Substring: " + ans);
    }
}