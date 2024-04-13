class Q8 {
    public static void main(String[] args) {
        int i, number, count;
        int input = Integer.parseInt(args[0]);
        System.out.println(" Prime Numbers from 1 to " + args[0] + "are : ");
        for (number = 1; number <= input; number++) {
            count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
            }
        }
    }
}
