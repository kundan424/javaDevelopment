package multithreading;

//import java.io.FileInputStream;
//import java.nio.channels.FileLockInterruptionException;

import java.util.Scanner;
/*
public class ExceptionDemo {
    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream(" d:/abc.txt"); // risky code
//        }catch (Exception e){
//            System.out.println(e); // handling code
//        }
        int x;
        System.out.println("1");
         try {
             System.out.println("2");
            x = 100/ 0;
             System.out.println("3");
            System.out.println(x);
             System.out.println("4");
        } catch (ArithmeticException e) {
//             System.out.println("5");
//            System.out.println(e);
//             System.out.println("6");


//             e.printStackTrace();
//             System.out.println(e.toString());
             System.out.println(e.getMessage());
             
        }
// Note : if there is no exception found then catch block will not be executed
//       similarly if exception occurs in try block then the code of below lines where exception occurs
//         will not execute and control go to catch block

        System.out.println( " end of program ");
    }
}

 */

 class CustomException extends  RuntimeException {
       CustomException ( String msg){
           super(msg);
       }
 }
 class Test{
     public static void main(String[] args) {
         System.out.println( "age : ");
         Scanner scanner = new Scanner(System.in);
         int age = scanner.nextInt();
         try {
             if ( age < 18){
                 throw  new CustomException(" you aren't eligible ");
//                 System.out.println( " 1 "); unreachable statement
         }else {
                 System.out.println( " you have voted successfully ");
             }
         }catch (Exception e){
             System.out.println(e);
         }
     }
 }