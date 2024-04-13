// Write a Java program to implement thread using runnable interface

class Test1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Test1 : Thread is running");
    }

}

class Test2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Test2 : Thread is running");

    }

}

public class Q3 {

    public static void main(String[] args) {
        Runnable t1 = new Test1();
        Runnable t2 = new Test2();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}
