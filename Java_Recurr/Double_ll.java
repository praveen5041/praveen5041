import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Double_ll {
   static private Node head;
    private class Node{
         int data;
         Node next;
         Node prev;
        public Node(int val){
            this.data=val;
        }
        public Node(int val,Node next,Node prev){
            this.data=val;
            this.next=next;
            this.prev=prev;
        }
    }
    public void Inser_f(int val){
        Node temp=new Node(val);
        temp.next=head;
        temp.prev=null;
        head=temp;
      // temp=head;
        if(head!=null){
            head.prev=temp;
        }
    }

    //inserting at last node
    public void Inser_l(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            node.prev=null;
           
            return;
        }
        Node new_node=head;
        while(new_node.next!=null){
            new_node=new_node.next;
        }
        new_node.next=node;
        node.prev=new_node;
        node.next=null;

    }
//inserting a value after the specified valiu
public Node find(int val){
    Node temp=head;
    while(temp!=null){
        if(temp.data==val){
            return temp;
        }
        temp=temp.next;
    }
    return null;
}
public void Inser_after(int val,int value){
    Node node=new Node(value);
    Node temp=find(val);
    if(temp==null){
        System.out.println("does't exist");
        return;
    }
    // temp.next=node;
    // node.prev=temp;
    //  node.next=temp.next;
     node.next=temp.next;
     temp.next=node;
     node.prev=temp;

    if(node.next!=null){
        node.next.prev=node;
    }
}

    public void display(){
        Node t=head;
        //Node l=null;
        while(t!=null){
            System.out.print(t.data+" ");
           // l=t;
            t=t.next;
        }
        // while(l!=null){
        //     System.out.print(l.data+" ");
        //     l=l.prev;
        // }
    }
    //reverse the linked list
    public void reverse_l(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.prev;
        }
    }
    public static void main(String[] args) {
        Double_ll list=new Double_ll();
        list.Inser_f(12);
        list.Inser_f(20);list.Inser_f(10);
        list.display();
       // list.reverse_l();
       list.Inser_l(100);
       System.out.println();
       list.display();
       list.Inser_after(20, 30);
       System.out.println();
        list.display();
    }
}
