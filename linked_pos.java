import java.util.Scanner;

public class linked_pos<T> {
    Node head;
    class Node{
        T data;
        Node next;
    
    Node(){
        data=null;
        next=null;
    }
    Node(T d){
        data=d;
        next=null;
    }
    }
    linked_pos(){head=new Node();}

    //insertin g data front of linked list
    public void insertFront(T data){
        Node newNode=new Node(data);
        newNode.next=this.head.next;
        this.head.next=newNode; 
    }

    //inserting node at END
    public void InsertEnd(T data){
        Node newNode=new Node(data);
        newNode.next=null;
        Node temp=this.head;

        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
    }
    public void print_list(){
        Node cuu_node=this.head.next;
        while(cuu_node!=null){
            System.out.println(cuu_node.data);
            cuu_node=cuu_node.next;
    
        }
    }
     void  Inser_Any(T data, T key){
        Node newNode=new Node(data);
        newNode.next=null;
        Node temp=this.head;
        boolean check=false;
        while(temp!=null){
            if(temp.data==key){
                check=true;
                break;
            }
            temp=temp.next;
        }
        if(check){
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public static void main(String[] args) {
        Linkedlist<Integer> list=new Linkedlist<>();
        list.insertFront(16);
        list.InsertEnd(13);
        list.InsertEnd(7);

       // list.Inser_Any(2, 1);
        list.print_list();
        list.Inser_Any(2, 1);
        list.print_list();
         

    }
}
