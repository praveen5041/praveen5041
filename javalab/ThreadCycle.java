package javalab;
class Cycle implements Runnable{
   public void run(){
    try {
        Thread.sleep(130);
    } catch (Exception e) {
        System.out.println(e);
        //TODO: handle exception
    }
   } 
}
public class ThreadCycle {
    public static void main(String[] args) {
        
    }
}
