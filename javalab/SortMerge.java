public class SortMerge<T extends Comparable<T>> {
    void merge(T arr[],int left,int middle,int right, T d1[],T d2[]){
        //sizes of two sub arrays
        int n1=middle-left+1;
        int n2=right-middle;
        //string two temparory sub arrays
        T L[]=d1;
        T R[]=d2;
        //copy of data to temparory arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[middle+i+1];
        }
        //merge two tamparary arrays
        int i=0,j=0;
        //intial index of merged subarray
        int k=left;
        while(i<n1&&j<n2){
            if(L[i].compareTo(R[j])<=0){
                arr[k]= L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        //compy remaining elemnts of two subarrays
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;k++;
        }
    }
    //merge sort
    void mergesort(T arr[],int left,int right, T d1[],T d2[]){
        if(left<right){
            int m=(left+right)/2;
            mergesort(arr, left, m, d1, d2);
            mergesort(arr, m+1, right, d1, d2);
            merge(arr, left, m, right, d1, d2);
        }
    }
    void printArray(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer i[]={2,0,2,1,1,0};
        SortMerge obj=new SortMerge<>();
        obj.printArray(i);
        Integer[] d1=new Integer[9];
        Integer d2[]=new Integer[9];
        obj.mergesort(i, 0,i.length-1, d1, d2);
        System.out.println("after merge sort");
        obj.printArray(i);
    }
}
