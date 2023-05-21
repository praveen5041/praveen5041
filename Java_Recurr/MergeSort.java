import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={12,4,5,9,7};
       // arr= merge_sort(arr);
       Merge_s(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
       // arr=Merge_s(arr, 0, 0);
    }
    static int[] merge_sort(int[] nums){
        
        if(nums.length==1){
            return nums;
        }
        int m=nums.length/2;
        int[] left=merge_sort(Arrays.copyOfRange(nums, 0, m));
        int[] right=merge_sort(Arrays.copyOfRange(nums, m, nums.length));
        return merge(left,right);
    }
    static int[] merge(int[] l,int[] r){
        int[] ans=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length&&j<r.length){
            if(l[i]<r[j]){
                ans[k]=l[i];
                i++;
            }
            else{
                ans[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<l.length){
            ans[k]=l[i];
            i++;
            k++;
        }
        while(j<r.length){
            ans[k]=r[j];
            j++;
            k++;
        }
        return ans;
    }
    //another approach modifying the original array only
    static void Merge_s(int[] arr, int s,int e){
        if(e-s==1){
            return;
        }
        int m=(e-s)/2;
        Merge_s(arr,s,m);
        Merge_s(arr,m,e);
        Merge_s(arr, s, m,e);
    }
    static void Merge_s(int[] arr,int s,int m,int e){
        int k=0;
        int[] ans=new int[e-s];
        while(s<m&&m<e){
            if(arr[s]<arr[m]){
                ans[k]=arr[s];
                s++;
            }
            else{
                ans[k]=arr[m];
                m++;
            }
            k++;
        }
        while(s<m){
            ans[k]=arr[s];
            s++;
            k++;
        }
        while(m<e){
            ans[k]=arr[m];
            k++;
            m++;
        }
        for(int i=0;i<ans.length;i++){
            arr[s+i]=ans[i];
        }
        
    }
}
