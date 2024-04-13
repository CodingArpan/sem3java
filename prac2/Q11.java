public class Q11 {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        // For loop iteration
        System.out.println("\nEven numbers are : ");
        for (int i = 1; i < range; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOdd numbers are : ");
        for (int i = 1; i < range; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        // while loop iteration
        System.out.println("\nEven numbers are : ");
        int i = 1;
        while (i < range) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\nOdd numbers are : ");
        i = 1;
        while (i < range) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        // do while loop iteration
        System.out.println("\nEven numbers are : ");
        int j = 1;
        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j < range);
        System.out.println("\nOdd numbers are : ");
        j = 1;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j < range);

    }
}
