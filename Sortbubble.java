public class Sortbubble<T extends Comparable<T>> {
    T[] a;
    Sortbubble(T[] x){
        a=x;
    }
    T getData(int i){
        return a[i];
    }
      void print(){
        for(int i=0;i<a.length;i++){
            System.out.println(this.getData(i)+" " );
        }
    }
    void bubblesort(){
        T temp;
        boolean swaped=true;
        for(int i=0;i<this.a.length-1&&swaped ;i++){
            swaped=false;
            for(int j=0;j<this.a.length-i-1;j++){
            if(a[j].compareTo(a[j+1])>0){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;    
                swaped=true; 
            }
        }
        }
    }
    public static void main(String[] args) {
        Integer[] a={12,31,5,6,2,9};
        Sortbubble<Integer> s=new Sortbubble<>(a);
        s.print();
        s.bubblesort();
        s.print();
    }
}
