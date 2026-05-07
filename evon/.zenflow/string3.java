// Count vowels and consonants
// "Hello World" ---> hello world ---> 3 vowels , 7 consonant

import java.util.*;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();

        // display string
        System.out.println("your string is :");
        System.out.println(str);

        // count voowels and consonants

        int vowels = 0;
        int consonant = 0;

        // convert string to lower case
        str = str.toLowerCase();

        // traverse the string
        for(int i = 0 ; i <= str.length()-1 ; i++){
            char ch = str.charAt(i);

            // check character is a letter
            if(ch >= 'a' && ch <= 'z'){
                // check letter is a vowels
                if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonant++;
                }
            }
        }

        System.out.println("numbers of vowels are : "+vowels);
        System.out.println("number of consonant are : "+consonant);
    }
}
