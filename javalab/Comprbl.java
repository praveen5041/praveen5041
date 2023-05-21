package javalab;

import java.util.*;
//import java.util.Collections;

public class Comprbl implements Comparable<Comprbl>{
    int id;
    String name;
    int age;
    Comprbl(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Comprbl s){
        if(age==s.age){
            return 0;
        }
        else if(age>s.age){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        ArrayList<Comprbl> l=new ArrayList<Comprbl>();
        l.add(new Comprbl(12, "Praveen", 18));
        l.add(new Comprbl(10, "aikas",28));
        Collections.sort(l);
        for(Comprbl st:l){
            System.out.println(st.id+" "+st.name+" "+st.age);
        }
    }
    
}
