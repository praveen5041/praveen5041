import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.transform.Source;



public class hi {
    public hi(String string) {
    }

    public static void main(String[] args) {
        Vector v=new Vector(1,3);
        v.addElement(new Integer(1));
        v.addElement(new String("hi"));
        v.add(123);
        System.out.println(v);
         Enumeration e=v.elements();
         while(e.hasMoreElements()){
            System.out.println(e.nextElement());
         }
         //by using the itarators
         Iterator i=v.iterator();
         while(i.hasNext()){
            System.out.println(i.next());
         }if(v.contains(123)){
            System.out.println("love");
         }
         else
            System.out.println("faluire");
        System.out.println("welcome");
        System.out.println(v.lastIndexOf(1));
        System.out.println(v.hashCode());
        //System.out.println(v.firstIndexOf(1));
    }
}
