public class LamExp {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("hi ra");
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("hi praveen");
                try {
                    Thread.sleep(900);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        });
        t1.start();
        t2.start();
    }
}
