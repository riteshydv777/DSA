
// Check anagram (e.g. "listen" & "silent")

import java.util.*;

public class string6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fist string :");
        String str1 = sc.nextLine();
        System.out.println("enter second string :" );
        String str2 = sc.nextLine();

        // display
        System.out.println("string 1 : " +str1);
        System.out.println("string 2 : " +str2);

        // logic for checking anagram
        // agar do word hai toh 
        // 1. length same hona chaiye ya frequency meanse dono word ka number of character smae hona chaiye.
        // 2. order may be different
        // example : listen , silent

        // part 1 : length check
        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
            return;
        }

        // part 2 : convert to array
        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();


        // part 3 : sort array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // part 4 : compare
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
