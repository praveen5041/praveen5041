import java.util.concurrent.LinkedBlockingDeque;

import javax.naming.spi.DirStateFactory;

//implementing our own linked list
public class Linked_list {
  static private Node head;
   static private Node tail;
    private static int size;
    public Linked_list(){
        this.size=0;
    }
    //insering elements at first node
    public void Insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    //inserting elements at last node
    //by using tail the time complexity is Constant
    //otherwise time complexity is O(n) by taking temp node move the pointer till the end of end
    public void Last_node(int val){
        if(tail==null){
            Insert(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    //inserting anywhere
    public void Inser_Any(int val,int idx){
        if(idx==0){
            Insert(val);
            return;
        }
        if(idx==size){
            Last_node(val);
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }


    //deleting the first node
    static int Delete_first(){
        int data=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }
    //deleting the last node
    static int Delete_end(){
        if(size<=1){
            return Delete_first();
        }
        Node second_last=get(size-2);
        int data=tail.value;
        tail=second_last;
        tail.next=null;
        return data;
    }
//deleting specific index in the linked list
    static int delete_any(int idx){
        if(idx==0){
            return Delete_first();
        }
        if(idx==size-1){
            return Delete_end();
        }
        Node prev=get(idx-1);
        int val=prev.next.value;
        prev.next=prev.next;
        return val;
    }

    static Node get(int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }


        //find specific node value
    static Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

//Linked list using the recurrsion
private void Inser_rec(int val,int idx){
    head=Inser_rec(val, idx, head);
}
public Node Inser_rec(int val,int idx, Node node){
    // if(node==null)
    // return node;
    if(idx==0){
        Node temp=new Node(val,node);
        size++;
        return temp;
    }
   // if(node!=null)
    node.next=Inser_rec(val, idx--, node.next);
    return node;

}

//eliminating the duplicate nodes
public void Dup(){
    Node t=head;
    
    while(t.next!=null){
        if(t.value==t.next.value){
            t.next=t.next.next;
            size--;
        }
        else{
            t=t.next;
        }
    }
   
    tail=t;
    tail.next=null;
}

//merge two sorted list
public static Linked_list merge(Linked_list first,Linked_list second){
    Linked_list ans=new Linked_list();
    Node f=Linked_list.head;
    Node s=Linked_list.head;
    while(f!=null&&s!=null){
        if(f.value<s.value){
            ans.Insert(f.value);
            f=f.next;
        }
        else{
            ans.Insert(s.value);
            s=s.next;
        }
    }
    while(f!=null){
        ans.Insert(f.value);
        f=f.next;
    }
    while(s!=null){
        ans.Insert(s.value);
        s=s.next;
    }
    return ans;
    
}

//getting mid
public static Node get_mid(Node head){
    Node midprev=null;
    while(head!=null&&head.next!=null){
        midprev=(midprev==null)?head:midprev.next;
    }
    Node m=midprev.next;
    midprev.next=null;
    return m;
}


    //Bubble sort 
    public void Bubble_sort(){
        Bubble_sort(size-1,0);
    }
    private void Bubble_sort(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Node first=get(c);
            Node second=get(c+1);
            if(first.value>second.value){
                //swap
                if(first==head){
                head=second;
                first.next=second.next;
                second.next=first;
                }
                else if(second==tail){
                    Node prev=get(c-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }
                else{
                    Node prev=get(c-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            Bubble_sort(r, c+1);
        }
        else{
            Bubble_sort(r-1, 0);
        }
    }

    //reversing the linked list usig recurrsion
     
    public void rever(Node node){
        if(tail==null){
            head=node;
            return ;

        }
        rever(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public class Node{
        private int value;
        private Node next;
        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        // Linked_list ll=new Linked_list();
        // ll.Insert(3);
        // ll.Insert(5);
        // ll.Insert(11);
        // ll.Insert(12);
        // ll.Insert(1);
       // ll.Inser_Any(120, 2);
        //ll.display();
    //     System.out.println();
    //     System.out.println(ll.Delete_first());
    //     ll.display();
    //    System.out.println();
    //    System.out.println(size);
    //    System.out.println( ll.delete_any(4));
    //    ll.display();
       //ll.Inser_rec(2,2);
    //    System.out.println();
    //    ll.Dup();
    //    ll.display();

    // Linked_list first=new Linked_list();
    // Linked_list second=new Linked_list();

    // first.Insert(1);
    // first.Insert(3);
    // first.Insert(5);
    // second.Insert(1);
    // second.Insert(2);
    // second.Insert(9);
    // second.Insert(14);
    // System.out.println(size);
    // Linked_list ans=Linked_list.merge(first, second);
    Linked_list bs=new Linked_list();
    bs.Insert(1);
    bs.Insert(2);
    bs.Insert(3);
    bs.Insert(4);
    bs.Insert(5);
    bs.display(); 
    //bs.Bubble_sort();
    bs.rever();
    System.out.println();
    bs.display();    
    }
}
