import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // creating 1st array
        System.out.println("Enter dimension for 1st Array");
        int r1 = scan.nextInt(), c1 = scan.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter Numbers for 1st Array");
        for (int r = 0; r < r1; r++) {
            for (int c = 0; c < c1; c++) {
                arr1[r][c] = scan.nextInt();
            }
        }

        // creating 2nd array
        System.out.println("Enter dimension for 2nd Array");
        int r2 = scan.nextInt(), c2 = scan.nextInt();
        int[][] arr2 = new int[r2][c2];
        if (c1 != r2) {
            System.out.print("Multiplication can not be Done !");
            return ;
        }
        System.out.println("Enter Numbers for 2nd Array");
        for (int r = 0; r < r2; r++) {
            for (int c = 0; c < c2; c++) {
                arr2[r][c] = scan.nextInt();
            }
        }
        int r3 = r1;
        int c3 = c2;
        int[][] mulArr = new int[r3][c3];

        // Multiplying multi dimension arrays
        for (int r = 0; r < r3; r++) {
            for (int c = 0; c < c3; c++) {
                mulArr[r][c] = 0;
                for (int i = 0; i < c1; i++) {
                    mulArr[r][c] += arr1[r][i] * arr2[i][c];
                }
            }
        }

       //print mulArr
        System.out.println("Multiplication of 2 Arrays is :");
        for (int r = 0; r < r3; r++) {
            for (int c = 0; c < c3; c++) {
                System.out.print(mulArr[r][c] + " ");
            }
            System.out.println();
        }

    }
}
