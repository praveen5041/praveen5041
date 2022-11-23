import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Traversing {
    public static void main(String[] args) {
        Vector ar=new Vector<>();
        for(int i=0;i<5;i++){
            ar.addElement(i);
        }
        Enumeration<Integer> en=ar.elements();
        while(en.hasMoreElements()){
        System.out.println(en.nextElement());
        }
         
        
    }
}
