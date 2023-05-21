import java.util.Scanner;

public class Count_sum {
    public static int Sum(int[] a,int s,int c,int i,int t){
        if(a.length==i){
            if(s==t){
                c++;
            }
            return c;
        }
       int p=Sum(a, s+a[i], c, i+1, t);
       int n=Sum(a, s-a[i], c, i+1, t);
       System.out.println(p+" "+n);
       return p+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(Sum(ar, 0, 0, 0, tar));
    }
}
