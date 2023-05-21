package Strings;

import java.util.*;

public class PhonePad {
    public static void main(String[] args) {
       System.out.println( Phone_Pad("", "234"));
    }
    static ArrayList<String> Phone_Pad(String emp, String Org){
        if(Org.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(emp);
            return list;
        }
        int digits=Org.charAt(0)-'0';
        ArrayList<String>list=new ArrayList<>();
        for(int i=(digits-1)*3;i<digits*3;i++){
            char ch=(char)('a'+i);
            list.addAll( Phone_Pad(emp+ch, Org.substring(1)));
        }
        return list;
    }
}
//if (digit >= 2 && digit <= 6) int i = (digit - 2) * 3; i <= ((digit - 1) * 3) - 1; i++
//int i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++
//int i = (digit - 2) * 3 + 1; i <= ((digit - 1) * 3) + 1; i++
//int i = (digit - 2) * 3 + 1; i < ((digit - 1) * 3) + 1; i++
