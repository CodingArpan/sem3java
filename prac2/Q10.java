class Q10 {

    public static void main(String args[]) {
        byte i = 50;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;

        System.out.println("Implict Type casting");
        System.out.println("byte value : " + i);
        System.out.println("short value : " + j);
        System.out.println("int value : " + k);
        System.out.println("long value : " + l);
        System.out.println("float value : " + m);
        System.out.println("double value : " + n);

        double d = 75.0;
        // Explicit casting is needed for below conversion
        float f = (float) d;
        long L = (long) f;
        int I = (int) L;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("Explicit Type casting");
        System.out.println("double value : " + d);
        System.out.println("float value : " + f);
        System.out.println("long value : " + L);
        System.out.println("int value : " + I);
        System.out.println("short value : " + s);
        System.out.println("byte value : " + b);
    }
    
}