// Write a Java Program to reverse the elements of an array

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - i - 1];
        }
        System.out.println("\nThe reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
        sc.close();
    }
}