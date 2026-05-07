// remove duplicates from sorted array

import java.util.*;

public class Array5 {

    // removeDuplicates()...
    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) return 0; 

        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    // display()...
    public static void display(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        display(arr, n);

        int newLength = removeDuplicates(arr);

        System.out.println("\nAfter removing duplicates:");
        display(arr, newLength);

        System.out.println("\nNew length: " + newLength);

        sc.close();
    }
}