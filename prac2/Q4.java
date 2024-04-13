public class Q4 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if (year % 400 == 0) {
            System.out.println("Year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year is a leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }
}
