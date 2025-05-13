// HashMap is a part of java collection
// HashMap stores the data in (key , value) pair.
import java.util.*;

public class  HashMapBasic{
    public static void main(String[]args){
        // declare HashMap
        HashMap<String , Integer> hm = new HashMap<>();
        // add key and value to hashmap
        
        // put()
        hm.put("India",135);
        hm.put("China",200);
        hm.put("Russia",100);
        hm.put("canada",30);

        // Display 
        System.out.println(hm);
        //hm.put("canada",25);
        //System.out.println(hm);

        // get()
        System.out.println(hm.get("India"));
        System.out.println(hm.get("canada"));

        // containsKey()
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("USA"));



    }
}
