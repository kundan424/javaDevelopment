package multithreading;
 class MyThread3 extends Thread{
     public void run(){
         for (int i = 1; i < 10; i++) {
             System.out.println(i);
             try {
                 Thread.sleep(3000);
             }catch (InterruptedException e ){}
         }
     }
 }
public class DaemonTest {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().isDaemon());
//        Thread.currentThread().setDaemon(true); //"illegalThreadState exception"
//        MyThread3 t = new MyThread3();
//        System.out.println(t.isDaemon());
//        t.setDaemon(true);
//        System.out.println(t.isDaemon());

//        t.setDaemon(true); // if we are commenting this line then both threads are non demon
//        and both executes till their completion
//        if not commenting then it is automatically terminated by jvm after completion of main thread
//        t.start();
//        System.out.println("end of main thread ");
//        t.stop(); deprecated
//        t.suspend();deprecated
//        t.resume();deprecated

        // THREAD ENHANCEMENT
        // (Thread Group)
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        ThreadGroup g1 = new ThreadGroup("first group");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1 , "second Group");
        System.out.println(g2.getParent().getName());
    }
}
