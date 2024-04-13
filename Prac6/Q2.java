class Q2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c + "--------");
        } catch (ArithmeticException
                | ArrayIndexOutOfBoundsException
                | NumberFormatException
                | NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
    }
}