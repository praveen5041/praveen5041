import java.io.*;
import java.util.*;

public class Linkedlist<T> {
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
    Linkedlist(){head=new Node();}

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
     
    //insertion an new node at any point 

    public void Inser_Any(T data, T key){
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

    //definig method for printing list
    public void print_list(){
        Node cuu_node=this.head.next;
        while(cuu_node!=null){
            System.out.println(cuu_node.data);
            cuu_node=cuu_node.next;

        }
    }

    //merging two nodes
    public void merge(Linkedlist<T> l5){
        Node fnode=this.head;
        Node snode=l5.head;
        while(fnode.next!=null){
            fnode=fnode.next;
        }
        fnode.next=snode.next;
        free(l5.head);
    }
    private void free(Linkedlist<T>.Node head2) {
    }


    //reversing the linkedlist method
    public Node remove(Node n){
        Node curr_node=n;
        Node next=n.next;
        Node prev=null;
        while(curr_node!=null){
            next=curr_node.next;
            curr_node.next=prev;
            prev=curr_node;
            curr_node=next;
        }
        this.head.next=prev;
        return next;
    }
    //ti reverse method
    public void reversr(){
        Node curr_node=this.head.next;
        System.out.println("reversed list");
        remove(curr_node);
    }
    
    //deletion Node
    public T deletion_fr(){
        T x=null;
        Node temp=this.head.next,prev=null;
        if(temp!=null){
            x=temp.data;
            this.head.next=temp.next;
            System.out.println("element deleted");
        }
        return x;
    }

    //deletion an element from end
    public T dele_ebd(){
        T x=null;
        Node temp=this.head.next,prev=null;
        if(temp!=null){
            while(temp!=null){
            prev=temp;
            temp=temp.next;
        }
        x= temp.data;
        prev.next=null;
    }
    return x;
    }

    //deleting a node anywhere from list
    public void delete_key(T value){
        Node temp=this.head.next, prev=null;
        while(temp!=null){
            if(temp.data==value){
                prev.next=temp.next;
                System.out.println("key element deleted");
                break;
            }
            else{
                    prev=temp;
                    temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
         Linkedlist<Integer> list=new Linkedlist<>();
         list.insertFront(16);
         list.InsertEnd(13);
         list.InsertEnd(7);
         list.insertFront(8);
         list.print_list();
         list.Inser_Any(1, 1);
        //  Linkedlist<Integer> str=new Linkedlist<>();
        //  str.InsertEnd(120);
        //  str.InsertEnd(122);
        //  str.insertFront(98);
        //  list.print_list();
        //  str.merge(list);
        //  str.print_list();
        //  str.reversr();
        //  str.print_list();


    }
}
