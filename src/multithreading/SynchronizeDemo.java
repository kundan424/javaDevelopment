package multithreading;

// SYNCHRONIZATION ( VERY IMPORTANT ** )

public class SynchronizeDemo {
    public static void main(String[] args) {
        /*
        // single object and multiple thread
        ThreadEg t1 = new ThreadEg(d1 , "kohli ");
        ThreadEg t3 = new ThreadEg( d1 , "Rohit ");
        ThreadEg t4  = new ThreadEg( d1 , " Dhoni");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

         */

        // multiple object and multiple object
        // in this case " NO REQUIREMENT OF SYNCHRONIZATION "
        // irregular output
        /*
        Display d1 = new Display();
        Display d2 = new Display();
        ThreadEg t1 = new ThreadEg(d1 , "kohli ");
        ThreadEg t2 = new ThreadEg( d2 , " kumar ");
     t1.start();
        t2.start();
    }
         */
//       multiple object and multiple thread with " static synchronized method "
//          regular output
        Display d1 = new Display();
        Display d2 = new Display();
        ThreadEg t1 = new ThreadEg(d1 , "kohli ");
        ThreadEg t2 = new ThreadEg( d2 , " kumar ");
        t1.start();
        t2.start();
    }

}
     class Display {
    /* 1. UnSynchronized wish method


         public void wish(String name) {
             for (int i = 0; i < 10; i++) {
                 System.out.print(" Good morning ");
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 }
                 System.out.println(name);
             }
         }

     */


//         2. Synchronized wish method
         /*
         public synchronized void wish(String name) {
             for (int i = 0; i < 10; i++) {
                 System.out.print(" Good morning ");
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 }
                 System.out.println(name);
             }
             // Note : if we don't declare wish method as synchronizer then both threads will be executed
             // simultaneously , and we will get irregular output ;

             // eg : Good morning  Good morning  Good morning  Good morning  Dhoni
             // Good morning  kumar
             // Good morning kohli
             // Good morning Rohit
             // Good morning  kumar

             // if we declare wish method as synchronizer then we will get regular output
         }

          */


         //   3. STATIC SYNCHRONIZER WISH METHOD
         public static synchronized void wish(String name) {
             for (int i = 0; i < 10; i++) {
                 System.out.print(" Good morning ");
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 }
                 System.out.println(name);
             }

         }
     }
class ThreadEg extends  Thread{
    Display d;
    String name ;
    ThreadEg ( Display d , String name){
        this.d = d;
        this.name = name ;
    }
    public void  run (){
        d.wish(name);
    }
}