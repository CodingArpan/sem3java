import java.util.Scanner;

class Date {
    String Day, Month;
    int Year;
    Scanner scan = new Scanner(System.in);

    void set_date() {
        System.out.println("Enter the date in the format : Day Month Year");
        Day = scan.next();
        Month = scan.next();
        Year = scan.nextInt();
    }

    void get_date() {

        System.out.println("Your date is " + Day + " " + Month + " " + Year);

    }
}

class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.set_date();
        d1.get_date();
    }
}