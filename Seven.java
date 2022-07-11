package javalab;
import java.util.*;
public class Seven {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String strArray[]=str.split(" ");
      for(String s:strArray){
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("Your intials are:"+ s.charAt(0));
      }
     // str. 
    }
}
