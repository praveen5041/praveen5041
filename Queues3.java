import java.util.*;
import java.util.concurrent.BlockingQueue;
public class Queues3 {
    public static void main(String[] args) {
        Queue<String>qu=new PriorityQueue<>();
        qu.add("hi");
        qu.add("welcome");qu.offer("java");
        System.out.println(qu.peek());
        System.out.println(qu);
        //qu.peek();
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu);

        //declaration of queue using linkedlist
        Queue<Integer>ql=new LinkedList<>();
        ql.add(56);
        ql.add(45);
        System.out.println(ql);
        //Array blocking Queue
        // BlockingQueue<Integer>bq=new ArrayBlockingQueue<>(2); 
        // bq.add(34);
        // bq.add(78);
        // System.out.println(bq);
        String city[]={"hyd","Ts","us","uk"};
        Queue<String>qstr=new PriorityQueue<>();
             
        Collections.addAll(qstr, city);
        System.out.println(qstr);
    }
}
