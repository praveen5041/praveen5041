import java.util.Scanner;

public class Mergedsort {
    public static void divide(int[] arr,int si,int ei,int[] a1,int[] a2){
        if(si<ei){
             
        
        int mid=si+(ei-si)/2;
        divide(arr, si, mid,a1,a2);
        divide(arr, mid+1, ei,a1,a2);
        merge(arr,si,mid,ei,a1,a2);
        }
    }
    public static void merge(int[] arr, int si,int mid,int ei,int[] a1,int[] a2){
        int[] nums=new int[ei-si+1];
        int idx=mid-si+1;
        int idx1=ei-mid;
       // int x=0;
       int[] L=a1;
       int [] R=a2;
       for(int i=0;i<idx;i++){
            L[i]=arr[idx+1];
       }
       for(int i=0;i<idx1;i++){
        R[i]=arr[mid+i+1];
       }
       int i=0,j=0;
       int k=si;
       while(i<idx&&j<idx1){
        if(L[i]<R[j]){
            arr[k]= L[i];
            i++;
        }
        else{
            arr[k]=R[j];
            j++;
        }
        k++;
        }
        while(i<idx){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<idx1){
            arr[k]=R[j];
            j++;k++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a1[]=new int[n];
        int a2[]=new int[n];
        divide(arr,0,n-1,a1,a2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
