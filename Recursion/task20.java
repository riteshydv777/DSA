// Print Subsequence
import java.util.*;
public class task20 {

    public static void printss(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        // recursive call
        printss(roq,ans+ch);
        printss(roq,ans+"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printss(str,"");
    }
}
