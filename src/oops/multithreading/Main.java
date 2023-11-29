package src.oops.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hello = new HelloWorldPrinter();
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(hello);
        t.start();

//        System.out.println(t.getName());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());

    }
}

class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
