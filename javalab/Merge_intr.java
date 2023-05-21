import java.util.Arrays;
import java.util.Scanner;

public class Merge_intr {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int[][] a=new int[r][2];
        for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                a[i][j]=s.nextInt();
            }
        }
       
        for(int i=1;i<a.length;i++){
            int[][] ans=new int[2][2];
            
            if(a[i][0]<=a[i-1][1]){
                ans[i-1][0]=a[i-1][0];
                ans[i-1][1]=a[i][1];
                System.out.println(a[i-1][0]+" "+a[i][1]);
            }
        System.out.println(Arrays.toString(ans));
        }
        System.out.println(a.length);
    }
}
