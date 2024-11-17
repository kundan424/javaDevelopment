package multithreading;
// join method
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join(); // if we comment this line then both main and child thread execute simultaneously
        // and we cant predict the exact output
        // if we do not comment this line then object of main thread will call the join method , Hence main
        // thread will wait until completing child thread
        // output is :
        for (int i = 0; i < 10; i++) {
            System.out.println(" ram thread ");
        }

    }
}
