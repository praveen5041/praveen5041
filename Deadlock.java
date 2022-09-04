package javalab;

public class Deadlock {
    public static void main(String[] args) {
        final String r1="hi";
        final String r2="weclome";
        Thread t1=new Thread(){
            public void run(){
                synchronized(r1){
                    System.out.println("Thread 1: Locker r1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    synchronized(r2){
                        System.out.println("Thread 1: lock Thread 2");
                    }
                }
                
            }
        };
        Thread t2 =new Thread(){
            public void run(){
                synchronized(r2){
                    System.out.println("Thread 2: lock r2");
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    synchronized(r1){
                        System.out.println("Thread 2: Lock r1");
                    }
                }
               
            }
        };
        t1.start();
        t2.start();
    }

}
