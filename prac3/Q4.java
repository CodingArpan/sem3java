import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array dimension");
        int d = scan.nextInt();
        int[] arr = new int[d];
        System.out.println("Enter 10 array elements");
        for (int i = 0; i < d; i++) {
            arr[i] = scan.nextInt();
        }
        int[] sortedArr = new int[d];

        for (int i = 0; i < d; i++) {
            int index = 0;
            for (int j = 0; j < d; j++) {
                if (arr[i] > arr[j]) {
                    ++index;
                }
            }
            sortedArr[index] = arr[i];
        }

        System.out.println("Sorted Array is : ");
        for (int i = 0; i < d; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
