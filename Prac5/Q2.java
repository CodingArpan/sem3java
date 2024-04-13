
class Worker {
    String name;
    int basic;

    Worker(String n, int b) {
        this.name = n;
        this.basic = b;
    }

    void display() {
        System.out.println("name : " + this.name + " basic : " + this.basic);
    }
}

class Wages extends Worker {
    int hrs, rate, wage;

    Wages(String n, int b, int h, int r) {
        super(n, b);
        this.hrs = h;
        this.rate = r;
        this.wage=h*r+this.basic;
        
    }

    double overtime() {
        System.out.println("overtime : " + this.hrs * this.rate);
        return this.hrs * this.rate;
    }

    void display() {
        System.out.println("name : " + this.name + " wages : " + this.wage);

    }

}

class Q2 {
    public static void main(String[] args) {
        Wages w1 = new Wages("anmol", 20000, 5, 20);
        w1.display();
    }
}

