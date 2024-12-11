package multithreading;
class  Display2 {
    public synchronized void displayN(){
        for ( int i = 0 ; i < 10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e ){}
        }
    }

    public synchronized void displayC(){
        for ( int i = 65; i < 75 ; i++){
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e ){}
        }
    }
}
class MyThread1 extends Thread{
    Display2 d;
    MyThread1(Display2 d ){
        this.d = d;
    }
    public void run (){
        d.displayC();
    }
}
class MyThread2 extends Thread {
    Display2 d;

    MyThread2(Display2 d) {
        this.d = d;
    }

    public void run() {
        d.displayN();

    }
}
public class SynchronizedDemo2 {
    public static void main(String[] args) {
 Display2 d = new Display2();
 MyThread1 t1 = new MyThread1(d);
 MyThread2 t2 = new MyThread2(d);
 t1.start();
 t2.start();
    }
}

