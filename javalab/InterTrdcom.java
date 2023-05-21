package javalab;

public class InterTrdcom extends Thread {
    int money=1000;
    synchronized void withdraw(int money){
        if(this.money<money){
            System.out.println("money is less:");
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        this.money-=money;
    }
    synchronized void deposit(int amount){
        this.money+=amount;
        System.out.println("deposit completed");
        notify();
    }
    public static void main(String[] args) {
         final InterTrdcom o=new InterTrdcom();
         new Thread(){
            public void run(){
                o.withdraw(1200);
            }
         }.start();
        //  final InterTrdcom o=new InterTrdcom();
        //  new Thread(){
        //      public void run(){
        //          o.withdraw(1200);
        //      }

        //  }.start();
        //  new Thread(){
        //      public void run(){
        //          o.deposit(700);
        //      }
        //  }.start();
    }
}
