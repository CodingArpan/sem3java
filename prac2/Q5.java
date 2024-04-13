class Q5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("factorial: " + factorial);
    }
}
