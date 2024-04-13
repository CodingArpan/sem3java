
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Test1 : Thread is running");
    }

}


public class Q1 {

    public static void main(String[] args) {
        A t1 = new A();
        Thread th1 = new Thread(t1);
        th1.start();
    }
}