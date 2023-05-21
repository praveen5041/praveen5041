import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
Cyclic(arr);
System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            
            int cur=arr[i]-1;
            if(arr[i]!=arr[cur]){
                swap(arr,i,cur);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int s,int l){
        int t=arr[s];
        arr[s]=arr[l];
        arr[l]=t;
    }
}
