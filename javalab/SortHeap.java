import java.security.Principal;

public class SortHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;
    private int maxsize;
    private static final int front=0;
    public SortHeap(T[] arr, T node){
        this.size=0;
        this.maxsize=arr.length;
        heap=arr;
        heap[0]=node;

    }
    private int parent(int pos){
        return pos/2;
    }
    private int leftChild(int pos){
        return 2*pos;
    }
    private int rightChild(int pos){
        return (2*pos)+1;
    }
    private boolean isleaf(int pos){
        if(pos>=(size/2)&&pos<=size){
            return true;
        }
        return false;
    }
    private void swap(int x,int y){
        T temp;
        temp=heap[x];
        heap[x]=heap[y];
        heap[y]=temp;
    }
    public static void main(String[] args) {
        
    }
}
