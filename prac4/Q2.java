import java.util.Scanner;

class Box {
    int length, width, Height;
    Scanner scan = new Scanner(System.in);

    Box() {
        System.out.println("Enter length of the box:");
        this.length = scan.nextInt();
        System.out.println("Enter width of the box:");
        this.width = scan.nextInt();
        System.out.println("Enter height of the box:");
        this.Height = scan.nextInt();
    }

    int calcVolume() {
        return this.length * this.width * this.Height;
    }

}

class Q2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println("Volume of the box is " + b1.calcVolume());
    }
}
