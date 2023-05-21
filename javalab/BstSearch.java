
import java.util.*;
public class BstSearch<T extends Comparable<T>> {
    int b_s(T[] arr,int l,int r,T x){
        if(l<=r){
            int m=(r-l)/2;
            if(arr[m]==x){
                    return m;
            }
            if(arr[m].compareTo(x)==1){
                return b_s(arr, l, m-1, x);
            }
            return b_s(arr, l, m+1, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        BstSearch<Integer>bst=new BstSearch<>();
        Integer ar[]={1,2,12,11,34,14,67,100};
        int  x=10;
        if(bst.b_s(ar, 0,8, x)==-1){
            System.out.println("not");
        }
        else{
            System.out.println("found");
        }
    }
    
}
