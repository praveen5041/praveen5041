package javalab;
import java.util.*;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many eggs you want:");
        int eggs=sc.nextInt();
        int dozens=eggs/12;
        System.out.println("The number of dozens eggs:"+dozens);
        int remainigEggs=eggs%12;
        System.out.println("Remaing eggs are:"+remainigEggs);
    }
}
