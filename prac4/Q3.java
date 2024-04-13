
import java.util.Scanner;

class Equation {
    int a, b, c;

    Scanner scan = new Scanner(System.in);

    double discriminant() {
        double d = (this.b * this.b) - (4 * this.a * this.c);
        return d;
    }

    void Get_info() {

        System.out.println("Enter the values of a,b,c");
        this.a = scan.nextInt();
        this.b = scan.nextInt();
        this.c = scan.nextInt();
    }

    void Real() {
        double d = this.discriminant();
        double r1 = (-this.b + Math.sqrt(d)) / (2 * this.a);
        double r2 = (-this.b - Math.sqrt(d)) / (2 * this.a);
        System.out.println("Roots are real and distinct");
        System.out.println("Roots are " + r1 + " and " + r2);
    }

    void Equal_values() {
        double d = this.discriminant();
        double r = -this.b / (2 * this.a);
        System.out.println("Roots are real and equal");
        System.out.println("Roots are " + r + " and " + r);

    }
}

class Quadratic {
    public static void main(String[] args) {
        Equation eq = new Equation();
        eq.Get_info();
        double d = eq.discriminant();
        System.out.println(eq.a + " " + eq.b + " " + eq.c + " " + d);
        if (d > 0) {
            eq.Real();
        } else if (d == 0) {
            eq.Equal_values();
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
