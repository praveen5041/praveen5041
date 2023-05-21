abstract class A{
    public A(){
        System.out.println(10);
    }
}
class B extends A{
    public B(){
        System.out.println(20);
    }
}
public class Stack{
     
    public static void main(String[] args) {
       
         new B(); 
    }
}
