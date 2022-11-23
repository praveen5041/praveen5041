public class QueuesL<T> {
    Linkedlist<T> froent,rear;
    QueuesL(){
        froent=new Linkedlist<>();
        rear=froent;
    }
    void enque(T a){
        this.rear.InsertEnd(a);
    }
    T deque(){
        T x=null;
        if(!isEmpty()){
            this.froent.deletion_fr();
        }
        else{
            System.out.println("underflow");
        }
        return x;
    }
    boolean isEmpty(){
        if(this.froent==null){
            return true;
        }
        else{
            return false;
        }
    }
    void print_queue(){
        if(this.froent==null){
            System.out.println("queue is empty");
        }
        else{
            this.froent.print_list();
        }
    }
    public static void main(String[] args) {
        QueuesL<Integer>q=new QueuesL<>();
        q.enque(12);q.enque(29);q.enque(98);
        q.print_queue();

    }
}
