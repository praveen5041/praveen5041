class Counter{
    int count;
    public synchronized void incre(){
        count++;
    }
}
public class Sync {
    public static void main(String[] args) throws Exception {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    c.incre(); 
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run(){
                for(int i=0;i<1000;i++){
                    c.incre(); 
                }
            }
        });
        // Counter c=new Counter();
        // c.incre();
        t1.start();
        t2.start();
       
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
