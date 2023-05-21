package javalab;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,md=1,nmax=1;
        for(int i=1;i<=10000;i++){
            if(n%i==0){
                c+=1;
            }
             if(c>md){
                 md=c;
                 nmax=n;
                 System.out.println(nmax);
             }
        }
        System.out.println(c);
       // System.out.println(n);
    }
}
