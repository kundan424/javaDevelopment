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

        // THREAD ENHANCEMENT lec : 1
        // (Thread Group)
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        ThreadGroup g1 = new ThreadGroup("first group");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1, "second Group");
        System.out.println(g2.getParent().getName());
        System.out.println(g1.getMaxPriority());
//        g2.setMaxPriority(4); // not affected the output , output only affected by changing the maxPriority of
//        g1.
        Thread t1 = new Thread(g1, "Thread1 ");
        Thread t2 = new Thread(g1, "Thread2 ");
        t1.start();
        t2.start();
        System.out.println(g1.activeCount());
        g1.setMaxPriority(3);
        Thread t3 = new Thread( g1 , "thread 3");
//        System.out.println(t1.getPriority());
//        System.out.println(t1.getPriority());
//        System.out.println(t3.getPriority());
      g1.list();
//        System.out.println(g1.getName());



    }
}
class ThreadDemo4{
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread [] t = new Thread[system.activeCount()];
        system.enumerate(t);
        for ( Thread t1 : t){
            System.out.println( t1.getName() +"->" + t1.isDaemon());
        }
    }
}
