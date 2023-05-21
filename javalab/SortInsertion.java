

public class SortInsertion {
   public static  void  sortInsertion(int[] arr, int l){
        for(int i=0;i<l;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j=j-1;
                System.out.print(arr[j]+" ");
            }
            
        }
    }
    public static  void print(int[] arr, int l){
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] a={12,8,3,5,14,9};
        int n=a.length;
        print(a,a.length);
        sortInsertion(a,n);
        print(a,n);
        //a.forEach(System.out::println);
    }
    
     
}
