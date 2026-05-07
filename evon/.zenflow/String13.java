// Group Anagram Frequency tracker....

import java.util.*;

public class String13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of strings
        System.out.println("enter number :");
        int N = sc.nextInt();
        String[] strings = new String[N];

        // Read strings
        System.out.println("enter strings :");
        for (int i = 0; i < N; i++) {
            strings[i] = sc.next();
        }

        // Input number of queries
        System.out.println("enter number queries :");
        int Q = sc.nextInt();
        String[] queries = new String[Q];

        // Read queries
        System.out.println("enter string : ");
        for (int i = 0; i < Q; i++) {
            queries[i] = sc.next();
        }

        // Build frequency map
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);              // sort characters
            String key = new String(chars);  // create key

            map.put(key, map.getOrDefault(key, 0) + 1);
        } 

        // Process queries
        for (String query : queries) {
            char[] chars = query.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            System.out.print(map.getOrDefault(key, 0) + " ");
        }

        sc.close();
    }
}