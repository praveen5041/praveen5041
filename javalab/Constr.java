package javalab;

import java.util.ArrayList;
import java.util.Iterator;

class Stu{
    int id;
    String name;
    float sal;
    Stu(int id, String name,float sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
}
public class Constr {
    public static void main(String[] args) {
        Stu s=new Stu(101,"praveen",1220);
        Stu s1=new Stu(121,"anil",10000);
        ArrayList<Stu>sa=new ArrayList<Stu>();
        sa.add(s);
        sa.add(s1);
       // Iterator itr=sa.iterator();
       // while(itr.hasNext())
       for(Stu st:sa){
            //Stu st=(Stu)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.sal);
        }

        System.out.println("hi");
    }
}
