import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter the skip point number : ");
        Scanner input = new Scanner(System.in);
        int skipoint = input.nextInt();
        System.out.println("How many total no. of tables do you want : ");
        int tableno = input.nextInt();

        for (int i = 1; i <= tableno; i++) {

            for (int j = 1; j <= 10; j++) {
                if (j == skipoint)
                    continue;
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println('\n');
        }
    }
}
