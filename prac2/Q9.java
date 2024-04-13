public class Q9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("The Numbers are a = " + a + " b = " + b + " c = " + c);
        int max = (a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.println("Max= " + max);
        int min = (a < b ? (a < c ? a : c) : (b < c ? b : c));
        System.out.println("Min= " + min);
    }
}
