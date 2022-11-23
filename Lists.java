import java.util.*;

import javalab.CollectOne;

public class Lists {
    public static void main(String[] args) {
         //int[] a={12,9,4,3};
        Vector a=new Vector<>();
        Vector v=new Vector<>();
         a.add(1);
         a.add(12);
         a.add(8);
         a.add(10);
         a.add("hi");
         a.add("java");
         a.add(1);
         System.out.println(a);
         //v=(Vector) a.clone();
         v.add(1);
         v.add(11);
         System.out.println(v);
         System.out.println(v.contains(a));
        //  Enumeration ven=v.elements();
        //  while(ven.hasMoreElements()){
        //     System.out.println(ven.nextElement());
        //  }
        //  Iterator itr=v.iterator();
        //  while(itr.hasNext()){
        //     System.out.println(itr.next());
        //  }
        //  System.out.println(v);
        
        //  System.out.println(Arrays.asList(a));
        //  System.out.println(Arrays.stream(a));
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));

        //searching
       // int n=3;
        //Collections.sort(a);
        // System.out.println(Collections.binarySearch(a, n));
        // Collections.fill(a, 9);
        // System.out.println(a);
        
    }
}
