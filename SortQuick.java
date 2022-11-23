public class SortQuick<T extends Comparable<T>> {
    T arr[];
    SortQuick(T ar[]){
        arr=ar;
    }
    T getData(int i){
        return arr[i];
    }
    void printData(){
        for(int i=0;i<arr.length;i++){
            System.out.println(this.getData(i));
        }
    }
    //method to partions
    int partion(T array[], int left,int right){
        T pivot=array[right];
        int i=(left-1);
        T temp;
        for(int j=left;j<=right;j++){
            if(array[j].compareTo(pivot)<0){
                i++;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        temp=array[i+1];
        array[i+1]=array[right];
        array[right]=temp;
        return i+1;
    }
    void quickSort(int left,int right){
        if(left<right){
            int pi=partion(arr, left, right);
            quickSort(left, pi-1);
            quickSort(pi+1, right);
        }
    }
    public static void main(String[] args) {
        Integer[] i={12,9,5,23,15,10};
         
        SortQuick<Integer>obj=new SortQuick<Integer>(i);
        System.out.println("Bfore sorting");
        obj.printData();
        obj.quickSort(0,i.length-1);
        System.out.println("after sorting");
        obj.printData();
    }
}
