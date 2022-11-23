import java.util.*;
import java.io.*;
class Student{
    String name;
    double age;
    Student(String str,double ag){
        this.name=str;
        this.age=ag;
    }
    void print_data(){
        System.out.println("Names:"+name);
        System.out.println("Age:"+age);
    }
}
public class LInked_list2<T> {
    
     public static void main(String[] args) {
         Student arr[]=new Student[4];
         arr[0]=new Student(" Praveen", 98);
         arr[1]=new Student(" Develop", 19);
         arr[2]=new Student(" Jaya", 27);
         arr[3]=new Student("str", 27);
         LinkedList<Student>list=new LinkedList<>(Arrays.asList(arr));
         System.out.println(list);
         Student temp;
         Iterator<Student>itr=list.iterator();
         while(itr.hasNext()){
             temp=itr.next();
             temp.print_data();
         }
}
}
