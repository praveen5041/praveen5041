import java.util.Scanner;
import java.util.*;
public class Stirngs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b=false;
        System.out.println(b);
        // String str=sc.nextLine();
        // String s=sc.next();
        // int di=Integer.parseInt(s);
        // System.out.println(di+10);
        // String st=sc.nextLine();
        // int n=str.compareTo(st);
        // System.out.println(n);
        // int ig=str.compareToIgnoreCase(st);
        // System.out.println(ig);
        //string concataions
        int i=sc.nextInt();
        String s=String.valueOf(i);
        System.out.println(s+10);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toUnsignedLong(i));
        System.out.println(Integer.toUnsignedString(i));
        System.out.println(Integer.toUnsignedString(i, 3));
        String str="hi thus is trim class";
        
        String tr=str.trim();
        System.out.println(tr);
        str.equals(tr);
    }
}
