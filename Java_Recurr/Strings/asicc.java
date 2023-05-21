package Strings;

import java.util.ArrayList;

public class asicc {
    public static void main(String[] args) {
        // char c='a';
        // System.out.println(c-0);
        //System.out.println(ascii("", "abc"));
        String str="abcd";
        System.out.println(str.subSequence(0, 4));
    }
    static ArrayList<String>ascii(String emp,String Org){
        if(Org.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(emp);
            return list;
        }
        char ch=Org.charAt(0);
        ArrayList<String>f=ascii(emp+ch, Org.substring(1));
        ArrayList<String>s=ascii(emp, Org.substring(1));
        ArrayList<String>t=ascii(emp+(ch+0), Org.substring(1));
        f.addAll(s);
        f.addAll(t);
        return f;
    }
}
