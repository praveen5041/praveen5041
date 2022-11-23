 

public class MinHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;
    private int Max_size;
    private static final int Front=1;
    public MinHeap(T[] arr, T node){
        this.Max_size=arr.length;
        this.size=0;
        heap=arr;
        heap[0]=node;
    }
    //auxiliary methods
    // method to return the position of  the parent for the node currently
    private int Parent(int current){
        return current/2;

    }
    //to return the position of left child 
    private int Lift_child(int posi){
        return (2*posi);
    }        
    //to return the right node position
    private int Right_chile(int posi){
        return (2*posi)+1;

    }
    //return the true if passed node is leaf
    private boolean Leaf_node(int pos){
        if(pos>=(size/2)&&pos<=size){
            return true;
        }
        return false;
    }
    //function to swap the nodes
    private void Swap(int fp,int sp){
        T temp;
        temp=heap[fp];
        heap[fp]=heap[sp];
        heap[sp]=temp;
    }
    //to print heap tree
    public void print(){
        for(int i=1;i<=size/2;i++){
            System.out.println("parent"+heap[i]);
            System.out.println("left child"+heap[2*i]);
            System.out.println("right child"+heap[2*i+1]);
            System.out.println();
        }
    }
    //function to minheap
    private void minheap(int pos){
        // if node is non-leaf node and greater than the any of its child
        if(!Leaf_node(pos)){
            if(heap[pos].compareTo(heap[Lift_child(pos)])>0 || heap[pos].compareTo(heap[Right_chile(pos)])>0){
                //swap with the left child and minheap the left child
                if(heap[Lift_child(pos)].compareTo(heap[Right_chile(pos)])<0){
                    Swap(pos, Lift_child(pos));
                    minheap(Lift_child(pos));
                }
                //swap the right child and minheap the right child
                else{
                    Swap(pos, Right_chile(pos));
                    minheap(Right_chile(pos));
                }
            }
        }
    }

    //method for inserting
    public void insert(T ele){
        if(size>=Max_size){
            return;
        }
        heap[++size]=ele;
        int current=size;
        while(heap[current].compareTo(heap[Parent(ele)])<0){
            Swap(current, Parent(current));
        }
    }
    //method to delete the node
    public T remove(){
        T poped=heap[Front];
        heap[Front]=heap[size--];
        minheap(Front);
        return poped;
    }
    //function to bulid the min heap using the minheap
    public void m_heap(){
        for(int i=(size/2);i>=1;i--){
            minheap(i);
        }
    }
    public static void main(String[] args) {
        Integer[] a=new Integer[3];
        MinHeap heap_area=new MinHeap<>(a, 5);
        heap_area.insert(12);
        heap_area.insert(22);
        heap_area.insert(9);
        heap_area.print();
    }

}
