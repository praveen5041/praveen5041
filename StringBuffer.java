import java.util.*;

public class StringBuffer {
    

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         String s=sc.nextLine();
         System.out.println(str.length());
        // System.out.println(str.capacity());
        //StringBuffer s=new StringBuffer("hi this is:");
        StringBuilder b=new StringBuilder("this is so and so");
       // b.delete(2, 5);
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.capacity());
      // StringBuffer sb=new StringBuffer();
       

        //hash code of strings
        System.out.println("Enter the new string");
        String st=sc.nextLine();
        System.out.println("enter string"+st.hashCode());
        st=st+"hi welcome";
        System.out.println(st.hashCode());
        String sr=sc.nextLine();
        StringBuilder buffer=new StringBuilder(sr);
        System.out.println(buffer.hashCode());
        buffer.append("like");
        System.out.println(buffer.hashCode());
    }
}
