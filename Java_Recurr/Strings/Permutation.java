package Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
    //  ArrayList<String>ans=  Perm("", "abcd");
      System.out.println(Counting("", "abcd",0));
    //   for(String s:ans){
    //     System.out.println(s);
    //   }
    }
    static void perm(String emp,String Org){
        if(Org.isEmpty()){
            System.out.println(emp);
            return;
        }
        char ch=Org.charAt(0);
        for(int i=0;i<=emp.length();i++){
            String f=emp.substring(0,i);
            String s=emp.substring(i,emp.length());

            perm(f+ch+s, Org.substring(1));
        }
    }

    //return arraylist
    static ArrayList<String>Perm(String emp,String Org){
        if(Org.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(emp);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        char ch=Org.charAt(0);
        for(int i=0;i<=emp.length();i++){
            String f=emp.substring(0, i);
            String s=emp.substring(i,emp.length());
            list.addAll(Perm(f+ch+s, Org.substring(1)));
        }
        return list;
    }
    //counting the nmber of permutations
    static int Counting(String emp, String Org,int c){
        if(Org.isEmpty()){
            return 1;
        }
        //int count =0;
        char ch=Org.charAt(0);
        for(int i=0;i<=emp.length();i++){
            String f=emp.substring(0, i);
            String s=emp.substring(i,emp.length());
            c=c+Counting(f+ch+s, Org.substring(1),0);
        }
        return c;
    }
}
