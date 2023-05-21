import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
             
        }
        System.out.println(arr);
        
           // Scanner sc=new Scanner(System.in);
           // int n=sc.nextInt();
            int[] app=new int[n];
            int[] raju=new int[n];
            int[] sum=new int[n];
            for(int i=0;i<n;i++){
                app[i]=sc.nextInt();
                
            }
            for(int i=0;i<n;i++){
                raju[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                sum[i]=app[i]+raju[i];
            }
            for(int i=0;i<n;i++){
                System.out.println(sum[i]);
            }
    }
}
