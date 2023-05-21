public class Bst1<T extends Comparable<T>> {
    T ele;
    Bst1<T>left;
    Bst1<T>right;
    public Bst1(T o){
        this.ele=o;
        this.left=null;
        this.right=null;
    }
    public Bst1(){
        this.ele=null;
        this.left=null;
        this.right=null;
    }
    //inserting elemetns 
    public void Insert(T a){
        if(ele.compareTo(a)<0){
            if(right==null){
                right=new Bst1<T>(a);
            }
            else{
                 right.Insert(a);
            }
        }
        else if(ele.compareTo(a)>0){
            if(left==null){
                left=new Bst1<T>(a);
            }
            else{
                left.Insert(a);
            }
        }
    }
    public Bst1<T> search(T key){
        if(this.ele.compareTo(key)==0){
            return this;
        }
        if(this.ele.compareTo(key)>0){
            if(this.left==null){
                return null;
            }
            return this.left.search(key);
        }
        else{
            if(this.right==null){
                return null;
            }
            return this.right.search(key);
        }
    }
    public void search_key(T res){
        if(search(res)==null){
            System.out.println("not found");
        }
        else{
            System.out.println("element found");
        }
    }
    public  void pre_order(Bst1<T> bst){
        if(bst!=null){
            
            pre_order(bst.left);
            bst.visit();
            pre_order(bst.right);
           
        }
        //return r;

    }
    public void visit(){
        System.out.println(this.ele+" ");
    } 
     
    public static void main(String[] args) {
        Bst1<Integer> bst=new Bst1<>(8);
       
        bst.Insert(21);
        
         
         bst.Insert(10);
         bst.Insert(18);
         bst.Insert(70);
         bst.Insert(200);
         bst.search_key(10);
         bst.search_key(100);
        // System.out.println(bst);
        bst.pre_order(bst);
        
    }
}
