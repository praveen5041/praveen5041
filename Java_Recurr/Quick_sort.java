import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] ar=new int[arr.length];
        System.out.println(ar[3]);
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        Set<Integer>s=new HashSet<>();
        
    }
    static void sort(int[] arr,int l,int h){
        while(l>=h){
            return ;
        }
        int s=l;
        int e=h;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e){
            while(pivot<arr[e]){
                e--;
            }
            while(pivot>arr[s]){
                s++;
            }
            if(s<=e){
                int t=arr[s];
                arr[s]=arr[e];
                arr[e]=t;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
    }
}
