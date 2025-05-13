
import java.util.*;
public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declare arrat of digits
        int[] numbers = new int[4] ;

        // take user inputs
        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Outputs : ");

        // display each number with crossponding character.
        
        for(int number : numbers){
            char character = (char) number ;
            System.out.println(number+"-"+character);
        }
    }
}
