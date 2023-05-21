package Strings;

import java.util.ArrayList;

public class subsequenc {
    public static void main(String[] args) {
       // subseq(" ", "123");
      // System.out.println(subs("", "abc"));
      //System.out.println(seq(null, "", "abc"));
      System.out.println(subs("", "abcd"));
        String str="abcd";
       // System.out.println(str.substring(1));
    }
    static void subseq(String emp, String Org){
        
        if(Org.isEmpty()){
            System.out.println(emp);
            return;
        }
        char ch=Org.charAt(0);
        subseq(emp+ch, Org.substring(1));

        subseq(emp, Org.substring(1));
    }

    //using arraylist
    static ArrayList<String> subs(String emp,String Org){
        if(Org.isEmpty()){
             ArrayList<String>lis=new ArrayList<>();
             lis.add(emp);
             return lis;
        }
        char ch=Org.charAt(0);
        ArrayList<String>r=subs(emp, Org.substring(1));
        ArrayList<String>l=subs(emp+ch, Org.substring(1));
        l.addAll(r);
        for(String str:l){
            if(str.length()==1){
                System.out.print(str+" ");
            }
        }
        return l;
    }

    //passing arraylist as argument
    static ArrayList<String>seq(ArrayList<String>list,String emp,String Org){
        if(Org.isEmpty()){
            list.add(emp);
            return list;
        }
        char ch=Org.charAt(0);
        ArrayList<String>l=seq(list, emp+ch, Org);
        ArrayList<String>r=seq(list, emp, Org);
        list.addAll(l);
        list.addAll(r);
        return list;
    }
}
