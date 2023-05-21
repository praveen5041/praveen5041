import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            String res="";
            for(int j=i;j<n;j++){
                res+=a[i]+" ";
                System.out.println(res);
            }
        }
    }
}
