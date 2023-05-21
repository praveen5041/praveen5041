public class SortSelection {
    public static void sortSelection(int[] arr,int l){
        for(int i=0;i<l;i++){
            int ri=i;
            for(int j=i+1;j<l;j++){
                if(arr[ri]<arr[j]){
                    ri=j;
                }
            }
            int temp=arr[ri];
            arr[ri]=arr[i];
            arr[i]=temp;
            System.out.print(arr[i]+" ");
        }
       
    }
    public static void print(int[] arr,int l){
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={12,8,91,12,45,6,10};
        print(a,a.length);
        sortSelection(a, a.length);
        print(a,a.length);
    }
}
