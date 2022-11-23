import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.*;

public class Stacks3 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(12);
        stack.push(2);stack.push(13);stack.add(2, 55);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.subList(1, 3));
        Iterator<Integer>itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("traversing reverse order    ");
        ListIterator<Integer>li=stack.listIterator(stack.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        Stack<Integer>st=new Stack<>();
        st.add(12);
        st.add(26);
        st.push(14);st.push(90);
        int inde=st.search(12);
        System.out.println("index of seach elemnt is:"+inde);
        st.forEach(da->{
            System.out.println(da);
        });
        System.out.println(st);

        //string to stacks
        Scanner sc=new Scanner(System.in);
        String[] sr=new String[4];
        for(int i=0;i<4;i++){
            sr[i]=sc.next();
        }
        Stack<String>stackstr=new Stack<>();
        for(String s:sr){
            stackstr.add(s);
        }
        System.out.println(stackstr);
        
        //copy of stacks
        Stack<Integer>in=new Stack<>();
       // in.push(78);in.push(98);in.push(87);
       in.add(7);in.add(9);
        ArrayList<Integer>lis=new ArrayList<>();
        lis.addAll(in);
        //System.out.println(lis);
        lis.forEach(copy->{System.out.println(copy);});
        
    }
}
