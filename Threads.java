//multi threading implemeted by Thread class
//class Threading extends Thread{

    //multi threading by runnable interface
//     class Threading implements Runnable{
//     public void run(){
//         try {
//             System.out.println(Thread.currentThread().getId());
//         } catch (Exception e) {
//             //TODO: handle exception
//             System.out.println(e);
//         }
//     }
// }
public class Threads implements Runnable{
    public void run(){
        try {
            System.out.println(Thread.currentThread().getId());
           // Thread.sleep(1700);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
    public static void main(String[] args)throws Exception {
        int a=4;
        for(int i=0;i<a;i++){
            //for thread class creating oblects
           // Threading o=new Threading();

           //to overcome multiple inheiritance
           Runnable r=new Threads();
            Thread o=new Thread(r);

           //Thread o=new Thread(new Threads());
            o.start();
            Thread.sleep(1700);
        }
    }
}
