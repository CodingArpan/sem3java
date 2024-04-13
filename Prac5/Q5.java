interface Shape {
    void area();
}

class Triangle implements Shape {
    int a;
    int b;
    int c;
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area() {
        System.out.println("area of triange is " + (a * b * c));
    }
}

class Rectangle implements Shape {
    int l;
    int w;
    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }
    public void area() {
        System.out.println("area of rectange is " + l * w);
    }
}

class Circle implements Shape {
    int r;
    Circle(int r) {
        this.r = r;
    }
    public void area() {
        System.out.println("area of rectange is " + 3.14 * r * r);
    }
}

class Q5 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 8, 9);
        Rectangle r1 = new Rectangle(5, 8);
        Circle c1 = new Circle(5);
        t1.area();
        r1.area();
        c1.area();
    }
}