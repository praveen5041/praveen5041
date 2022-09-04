package javalab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comprtr  {
    int id;String name;int age;
    Comprtr(int id, String name, int age) {
        this.id=id;
        this.name=name;this.age=age;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        ArrayList<Comprtr>s=new ArrayList<Comprtr>();
        s.add(new Comprtr(23, "Praveen", 2));
        s.add(new Comprtr(19, "Loki", 10));
        System.out.println("sorting by the names");
        Comparator<Comprtr>cm1=new Comparator<Comprtr>() {
        
            public int compare(Comprtr c1,Comprtr c2){
                System.out.println("comparing by the names");
                return c1.name.compareTo(c2.name);

            }
        };
        Collections.sort(s,cm1);
        for(Comprtr cc:s){
            System.out.println(cc.id+" "+cc.name+" "+cc.age );
        }
        Comparator<Comprtr>cm2=new Comparator<Comprtr>() {
            public int compare(Comprtr i,Comprtr j){
                System.out.println("sorting by age");
                if(i.age==j.age){
                    return 0;
                }
                else if(i.age>j.age){
                    return 1;
                }
                else {
                    return -1;
                }
            } 
        };
        Collections.sort(s,cm2);
        for(Comprtr ct:s){
            System.out.println(ct.id+" "+ct.name+" "+ct.age);
        }

    }
    
}
