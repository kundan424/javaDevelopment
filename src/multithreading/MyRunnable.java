package multithreading;

class MyRunnable implements Runnable{
public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println(" child thread ");
    }
}
}
 class ThreadsDemo{
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); // r : is target runnable
        t.start();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(" main thread ");
            // we get mixed results which we cant predict
        }
        /*
        //  various constructors
        Thread t = new Thread();
        Thread t = new Thread(Runnable r );
        Thread t = new Thread( String name);
        Thread t = new Thread(Runnable r, String name );
        Thread t = new Thread(Thread group g , String name );
        Thread t = new Thread(Thread group g , String name , Runnable r );
        Thread t = new Thread(Thread group g , String name , Runnable r , long stacksize);

         */



    }
}
