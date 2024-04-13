import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array dimension");
        int d = scan.nextInt();
        int[] arr = new int[d];
        System.out.println("Enter 10 array elements");
        for (int i = 0; i < d; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the element to be remove from array");
        int ele = scan.nextInt();
        for (int i = 0; i < d; i++) {
            if (arr[i] == ele) {
                --d;
                for (int j = i; j < d; j++) {
                    arr[j] = arr[j + 1];
                }
                continue;
            }
        }

        for (int i = 0; i < d; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}