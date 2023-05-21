import java.util.Scanner;

public class PrimeIs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       boolean b= Prime(n);
       System.out.println(b);
       System.out.println(Armstrong(n));
       for(int i=2;i<=100;i++){
        if(Prime(i))
        System.out.println(i+"");
    }
    }
    static boolean Prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;

            }
            c++;
            //return false;
        }
        return c*c>n;
    }
    static boolean Armstrong(int n){
        int ans=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            n/=10;
            sum=sum+r*r*r;
        }
        return sum==ans;
    }
    
}
