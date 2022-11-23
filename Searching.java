public class Searching<T extends Comparable<T>> {
    public int search(T[] arr, T x, int l){
        for(int i=0;i<l;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Searching<Integer>i=new Searching<>();
        Integer arr[]={12,78,1,3,5};
        Integer x=3;
        if(i.search(arr, x, 5)!=-1){
            System.out.println("found"+i.search(arr, x, 4));
        }
        else{
            System.out.println("not");
        }
    }
}
