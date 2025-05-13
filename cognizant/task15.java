
import java.util.*;
public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of pizzas purchased :");
        int pizza = sc.nextInt();
        System.out.println("enter number of puffs purchased :");
        int puffs = sc.nextInt();
        System.out.println("enter number of cold drinks purchased :");
        int cold_drink = sc.nextInt();


        System.out.println("Bills Details :");
        System.out.println("number of pizzas "+pizza);
        System.out.println("number of puffs "+puffs);
        System.out.println("number of cold_drinks "+cold_drink);

        int totalPrice = 100 * pizza + 20 * puffs + 10*cold_drink ;
        System.out.println("Total Price "+totalPrice);
        System.out.println("Enjoy the show ! ");


    }
}
