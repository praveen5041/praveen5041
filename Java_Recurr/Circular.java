import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Circular {
   static private Node head;
    static private Node tail;
    class Node{
        int dat;
        Node next;
        public Node(int val){
            this.dat=val;
        }
    }
    public Circular(){
        this.head=null;
        this.tail=null;
    }
    public void Insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    //deleting the node
    public void delete(int val){
        Node node=new Node(val);
        if(node.dat==val){
            head=node.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.dat==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head)
    }
    public void display(){
        Node node=head;
        if(node!=null){
            do{
                System.out.println(node.dat);
                node=node.next;
            }while(node!=head);
        }
    }
    public static void main(String[] args) {
        Circular c=new Circular();
        c.Insert(12);
        c.Insert(20);
        c.display();
    }
}
