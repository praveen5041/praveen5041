import java.util.*;
import java.io.*;
public class Queues<T> {
    T[] data;
    int froent,rear;
    int l=0;
    Queues(T[] d){
        data=d;
        froent=0;
        rear=-1;
        l=d.length;

    }
    //method to inserting elements into queue
    void enqueue(T a){
        if(rear>=l-1){
            System.out.println("queue is overflow");
        }
        else{
            rear++;
            data[rear]=a;
        }
    }
    //deleting queue element
    T dequeue(){
        T x=null;
        if(isEmpty()){
            System.out.println("underflow");
            return null;
        }
        else{
            x=data[froent];
            froent++;
            return x;
        }
        

    }
    boolean isEmpty(){
        if(froent>rear){
            return true;
        }
        else{
            return false;
        }
    }
    void printQueue(){
        if(!isEmpty()){
            for(int i=froent;i<=rear;i++){
                System.out.println(data[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Integer[] i=new Integer[2];
        Queues<Integer>q=new Queues<>(i);
        q.enqueue(12);q.enqueue(20);
        
        q.printQueue();
    }
}
