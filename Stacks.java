import java.util.*;
public class Stacks<T> {
    T[] data;
    int length;
    int top;
    Stacks(T[] a){
        data=a;
        length=a.length;
        top=-1;

    }
    void push(T a){
        if(top<length-1){
            top++;
            data[top]=a;

        }
        else
        System.out.println("stacks is over flow");
    }
    T pop(){
        T x=null;
        if(top==-1){
            System.out.println("stack is underflow");
        }
        else{
            x=data[top];
            top--;
        }
        return x;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void print_stack(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(data[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
         Integer a[]=new Integer[3];
         Stacks<Integer>list=new Stacks<>(a);
         list.push(12);
         list.push(23);list.push(38);
         list.pop();
         list.pop();
         list.pop();
         list.isEmpty();
         list.print_stack();
    }
}
