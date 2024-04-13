class shape {
    void area(int w, int h) {
        System.out.println("Area of your rectangle :" + (w * h));
    }

    void area(int a, int b, int c) {
        float s = (a + b + c) / 2;
        float arg = s * (s - a) * (s - b) * (s - c);
        double Area = Math.sqrt(arg);
        System.out.println("Area of your triangle :" + Area);

    }

    void area(int r) {
        double Area = (22 / 7) * r * r;
        System.out.println("Area of your triangle :" + Area);

    }
}

class Q7 {
    public static void main(String[] args) {
        shape s1 = new shape();
        s1.area(4, 5);
        s1.area(4, 5, 6);
        s1.area(4);
    }
}
