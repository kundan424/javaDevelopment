package multithreading;
// day 1
 class MyThread extends Thread {
/*
 public void run(){
    for ( int i = 0 ; i < 10 ; i++){
        System.out.println(" child thread ");
    } */

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

     public void start(){
         super.start();
         System.out.println(" start method ");
     }
     public void run(){
         System.out.println(" run method ");
     }

}
    public class ThreadDemo {
        public static void main(String[] args) {
            MyThread t = new MyThread();
            t.start(); //  here start method invoked because it Creates a new thread that executes `run()`
//            t.run();// every time same output because no thread creation every time( only one thread available)
        /*
            for (int i = 0; i < 10; i++) {
                System.out.println(" main thread ");
            }

         */

            System.out.println(" main method ");
        }
    }