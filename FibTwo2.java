import java.util.*;
public class FibTwo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int r;
        System.out.print(f+" ");
        System.out.print(s+" ");
        for(int i=2;i<n;i++){
            r=f+s;
            System.out.print(r+" ");
            f=s;
            s=r;
        }
        
    }
}
