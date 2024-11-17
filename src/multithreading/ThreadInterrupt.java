package multithreading;
// how a thread interrupt another thread
class MyThreads extends Thread {
     public void run() {
         /*
         try {
             for (int i = 0; i < 10; i++) {
                 System.out.println(" i am very lazy thread");
                 Thread.sleep(2000);
             }
         } catch (InterruptedException e) {
             System.out.println(" i got interrupt");

         }

          */

         // whenever the target thread is not in waiting or sleeping state for some time
 /*
         for ( int i = 0 ; i <= 10000; i++){
             System.out.println(" i am lazy thread " + i);
         }
         System.out.println( " i am entering into sleeping state ");
         try {
             Thread.sleep(5000);
         }catch (InterruptedException e ){
             System.out.println(" i got interrupted ");
         }

         // note: in this example interrupt method is waited until child thread
         // completed 10000 times for loop

  */
     }
 }
 public class ThreadInterrupt {
    public static void main(String[] args) {
        MyThreads t = new MyThreads();
  t.start();
  t.interrupt();/* if we comment this line then main thread will not interrupt child thread
       and then child thread will run for loop  ,
      if we are not commenting this line main thread interrupt child thread
      */
        System.out.println(" main thread ends ");

    }
}