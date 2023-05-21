class Tone{
    public static void main(String[] args) {
         

          Runnable o=new Runnable() {
             public void run(){
                 try {
                     for(int i=0;i<4;i++){
                     System.out.println("hi");
                     Thread.sleep(600);
                     }
                 } catch (Exception e) {
        //             //TODO: handle exception
                     System.out.println(e);
                 }
                
             }
          };
          Runnable o1=new Runnable(){
             public void run(){
                 try {
                     for(int i=0;i<4;i++){
                     System.out.println("welcome");
                     Thread.sleep(1000);
                     }
                 } catch (Exception e) {
        //             //TODO: handle exception
                     System.out.println(e);
                 }
             }
          };
          Thread t1=new Thread(o);
          Thread t2=new Thread(o1);
          t1.start();
          t2.start();
    }
}