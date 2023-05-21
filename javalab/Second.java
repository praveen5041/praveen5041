package javalab;
import java.util.*;
public class Second {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the user name:");
       String str=sc.nextLine(); 
       str.toUpperCase();
       System.out.println("Hello, "+str+" nice to meet you");
    }
}
