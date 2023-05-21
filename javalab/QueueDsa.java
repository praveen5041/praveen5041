

public class QueueDsa {
    
      static  int arr[];
      static  int size;
       static int rear=-1;
        QueueDsa(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear=-1;
        }
        //enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int info=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            re--;
            return info;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    
    
    public static void main(String[] args) {
        QueueDsa q=new QueueDsa(4);
        q.add(12);
        q.add(4);
        q.main(19);
        while(!q.isEmpty()){
            System.out.println(q.peek());
        }
    }

}
