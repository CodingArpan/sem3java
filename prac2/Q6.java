import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = obj1.nextInt();
        int val = num;
        int cubicsum = 0;
        while (val > 9) {
            int lastdigit = val % 10;
            cubicsum += lastdigit * lastdigit * lastdigit;
            val /= 10;
        }
        if (val != 0)
            cubicsum += val * val * val;

        if (cubicsum == num) {
            System.out.println("Given Number is a armstrong number");
        } else {
            System.out.println("Given Number is not a armstrong number");
        }
        

    }

}
