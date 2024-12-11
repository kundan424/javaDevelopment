package multithreading;
//INTER-THREAD COMMUNICATION

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
//        b.start();
        Thread.sleep(10000);
        synchronized (b){
            System.out.println(" main method calling wait method "); // order of execution : 1
            b.wait();
            System.out.println(" main method get notification "); // order of execution : 4
            System.out.println(b.total); // order of execution : 5
        }
    }
}
class ThreadB extends Thread{
    int total = 0 ;
    public void run(){
        synchronized (this){
            System.out.println(" child threads start calculation ");  // order of execution : 2
            for (int i = 1; i<= 100; i++) {
                total = total + i ;
        }
            System.out.println(" child thread trying to notify main method ");  // order of execution : 3
        this.notify();
        }
    }
}