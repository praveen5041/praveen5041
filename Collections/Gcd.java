import java.util.Scanner;

public class Gcd {
    int gcd(int m,int n){
        if(m>n) return gcd(n,m);
        if(m==n) return m;
        if(m==0) return n;
        if(m==1) return 1;
        return gcd(m,n%m);
    }
    public static void main(String[] args) {
        Gcd o=new Gcd();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(o.gcd(a, b));
        
    }
}
