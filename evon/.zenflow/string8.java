
// Count Words in Sentence

import java.util.*;
public class string8 {
    public static void main(String[] args) {
        String str = "  Hello    world java  " ;
        
        // arrays of string
        str = str.trim();
        String[] words = str.split("\\s ");

        System.out.println("words : " +words.length);
    }
}
