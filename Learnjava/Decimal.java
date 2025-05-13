import java.util.*;
    public class Decimal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number : ");
            int decimal = sc.nextInt();
             
            String hexadecimal = Integer.toHexString(decimal);
            System.out.println("Decimal: " + decimal);
            System.out.println("Hexadecimal: " + hexadecimal);
        }
    }
    

