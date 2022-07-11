package javalab;
import java.util.*;
public class Eight {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
     String str=sc.nextLine();
     boolean check=true;
     for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(Character.isLetter(c)){
            System.out.print(c);
            check=false;
        }
        else{
            System.out.println();
            check=true;
        }
     }
    }
}
