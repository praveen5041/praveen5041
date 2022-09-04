package javalab;

public class Method2 {
    int id;
    String name;
    static void show(Method2 m){
        System.out.println(m.id);
        System.out.println(m.name);
    }
    public static void main(String[] args) {
       Method2 m1=new Method2();
       m1.id=12;
       m1.name="java";
       show(m1); 
    }
}
