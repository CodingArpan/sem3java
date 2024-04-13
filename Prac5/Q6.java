// 

interface A {
    int a = 1;
}

interface B {
    int b = 2;
}

interface C extends A, B {
    int c = 3;
}

class D {
    int d = 4;
}

class E extends D implements C {
    int e = 5;

    void display() {

        System.out.Print((a + b + c + d + e));
    }
}

 class Q6 {
    public static void main(String[] args) {

        E interface1 = new E();
        interface1.display();
    }
}
