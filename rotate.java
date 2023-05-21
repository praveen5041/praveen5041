import java.lang.*;
import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int first=a[0];
        for(int i=0;i<n;i++){
            a[i]=a[i+1];
        }
        a[n]=first;
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
