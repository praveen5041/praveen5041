// Inter thread process communicaton

class Q{
    int n;
    boolean valueSet=false;
    public synchronized void put(int num){
        while(valueSet){
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println(num);
        this.n=num;
        valueSet=true;
        notify();
    }
    public synchronized void get(){
        while(!valueSet){
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println(n);
        valueSet=false;
        notify();
    }
}
class producer implements Runnable{
    Q q;
    public producer(Q q){
       // super();
        this.q=q;
        Thread t=new Thread(this,"producer");
        t.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}

class consumer implements Runnable{
    Q q;
    public consumer(Q q){
       // super();
        this.q=q;
        Thread t=new Thread(this,"producer");
        t.start();
    }
    public void run(){
        //int i=0;
        while(true){
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
}
}
public class InterThread {
    public static void main(String[] args) {
        Q q=new Q();
        new producer(q);
        new consumer(q);
    }
}
