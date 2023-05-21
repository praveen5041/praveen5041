import java.util.*;
public class Prior {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
             
        }
        int s=0;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            s+=arr[i];
        }
        System.out.println(s);
        int k=sc.nextInt();

        while(k--){
            int t=pq.peek();
        }
    }
}
