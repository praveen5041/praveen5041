import java.util.Scanner;

public class genaric<T,V> {
    public T a;
    public V b;
    genaric(T x, V y){
        a=x;
        b=y;
    }
    public void print(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    genaric<Integer,String> t=new genaric<Integer,String>(12,"Praveen");
     t.print();    

    }
}
