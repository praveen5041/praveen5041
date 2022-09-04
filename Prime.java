package javalab;

public class Prime {
    public static void main(String[] args) {
        int n=100;
        int[] a=new int[n+1];
       // boolean[] check=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(a[i]==0){
                for(int j=i*i;j<=n;j+=i){
                    a[j]=1;
                }
            }
        }
        for(int j=2;j<=n;j++){
            if(a[j]==0){
                System.out.print(j+" ");
            }
        }
    }
}
