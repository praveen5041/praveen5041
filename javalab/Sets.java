import java.util.*;
public class Sets {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        int b[]={1,2,3,12,4,5,6};
        
        Set<Integer>set=new HashSet<>(a);
        Set<Integer>s=new HashSet<>(b);
        set.add(12);
        set.add(1);set.add(4);set.add(89);
        //iterating the elements using lambda expressions
        set.forEach(System.out::println);
       // set.forEach(ele->{System.out.println(ele);});
        //to print common elements in givenlists    
        set.retainAll(s);
      // set.removeAll(s);
        System.out.println(set);
        Set<Integer>s1=new LinkedHashSet<>();
        Set<Integer>s2=new TreeSet<>();
    }
}
