package javalab;

public class Mcq {
    public static void main(String[] args) {
         int k=1;
         int n=Integer.parseInt(args[0]);
         for(int i=1;i<=n;i++){
            k*=i;
            System.out.println(k);
         }
    }
}
