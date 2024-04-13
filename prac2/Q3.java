import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter your average marks : ");
        int AvgNo = scan.nextInt();

        int level = AvgNo / 10;
        String grade = null;
        switch (level) {
            case 0:
                grade = "F";
                break;
            case 1:
                grade = "F";
            case 2:
                grade = "F";
                break;
            case 3:
                grade = "F";
                break;
            case 4:
                grade = "C";
                break;
            case 5:
                grade = "B";
                break;
            case 6:
                grade = "B+";
                break;
            case 7:
                grade = "B+";
                break;
            case 8:
                grade = "A";
                break;
            case 9:
                grade = "A+";
                break;
            case 10:
                grade = "A+";
                break;

        }
        System.out.print("Your Grade is : " + grade);

    }
}
