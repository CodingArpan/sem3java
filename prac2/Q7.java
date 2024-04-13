public class Q7 {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        int n = Integer.parseInt(args[0]);
        System.out.print(a + " " + b);
        for (int i = 1; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
