class Q3 {
    public static void main(String args[]) {

        double C, F = 100;

        C = F - (32 / 1.8);
        System.out.println("a) C = " + C);

        double Area, pi = 3.14, r = 2, R = 4, h = 7;

        Area = pi * r * r + 2 * pi * R * h;
        System.out.println("b) Area = " + Area);

        double Side, a = 3, b = 5, x = 8, cos, val;
        cos = Math.cos(x);
        val = (a * a) + (b * b) - (2 * a * b) * cos;
        Side = Math.sqrt(val);
        System.out.println("C) Side = " + Side);

    }

}