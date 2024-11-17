package multithreading;

 class MyThread extends Thread {
     public void run() {
         for (int i = 0; i < 10; i++) {
             System.out.println(" child thread ");


             /*
             // yield method
            // Thread.yield(); // if we are commenting this line then we cannot predict the which
             // thread will end first
             // if we are not commenting this line then child thread will always calls main thread and chance completing main thread is
             // is high
             */

            /*
             // join method
             try {
                 Thread.sleep(2500);
             }catch (InterruptedException e){};
         }

             */


             //run method overloading
     /*public void run(){
         System.out.println("no args run method"); // by default call by thread start method
    }
     public void run(int n ){
         System.out.println("int args run method");
     } */

             // if we not override run method then thread class run method executed which has empty implementation , Hence we wont
             // get any output . so it highly recommended to override the run method otherwise don't go for multithreading

  /*
     // overriding of start  method
     // start method called as normal method
     public void start(){
         System.out.println(" start method ");
     }
     public void run(){
         System.out.println(" run method ");
     }

   */

//     public void start(){
//         super.start();
//         System.out.println(" start method ");
//     }
//     public void run(){
//         System.out.println(" run method ");
//     }

         }
     }
 }

     public class ThreadDemo {
         public static void main(String[] args) {
             MyThread t = new MyThread();
             t.start(); //  here start method invoked because it Creates a new thread that executes `run()`
//            t.run();// every time same output because no thread creation every time( only one thread available)

             for (int i = 0; i < 10; i++) {
                 System.out.println(" main thread ");
             }


             //System.out.println(" main method ");
             //   t.start(); after the starting a thread if we trying to restart the same thread
             // then it throws run time exception (RE) , saying " illegalThread state exception "

           /*
            // getting and setting name of thread
            System.out.println(Thread.currentThread().getName());
            System.out.println(t.getName());
            Thread.currentThread().setName(" custom name ");
            System.out.println(Thread.currentThread().getName());

             */

            /*
            // get and set priority 
            System.out.println(Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(8);
            System.out.println(Thread.currentThread().getPriority());
            MyThread t = new MyThread();
            System.out.println(t.getPriority());

             */
         }
     }