import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Print Array Elements");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}