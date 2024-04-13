class Q1 {
    public static void main(String args[]) {
        int no1, no2;
        no1 = Integer.parseInt(args[0]);
        no2 = Integer.parseInt(args[1]);
        if (no1 > no2) {
            System.out.println("Max number is : " + no1);
        } else {
            System.out.println("Min number is : " + no2);
        }
    }
}