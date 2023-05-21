package javalab;
import java.util.*;
public class Sixth {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Students marks in three subjects:");
      int java=sc.nextInt();
      int EEE=sc.nextInt();
      int pyhton=sc.nextInt();
      float avrage=(java+EEE+pyhton)/3;
      System.out.println("The avarage of three subjects:"+avrage);  
    }
}
