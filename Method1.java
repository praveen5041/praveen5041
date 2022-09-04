package javalab;

import java.io.IOException;

public class Method1{
    //  void sum(int a[]){
    //     for(int i:a){
    //         System.out.println(i);
    //     }
    // array as return type
    int[] sum(){
        int a[]={12,87,1};
        return a;
    }
    
    public static void main(String[] args)throws IOException {
        Method1 m=new Method1();
       // int arr[]={1,3,12,3};
        int a[]=m.sum();
        for(int i:a){
            System.out.println(i);
        }
        //m.sum(new int[]{12,8,19});
        
    }
}