import java.util.*;

public class Bst<T extends Comparable<T>> {//comparable used to compare differnet types of data
    T element;
    Bst<T>left;
    Bst<T>right;
    public Bst(T obj){
            this.element=obj;
            this.left=null;
            this.right=null;

    }
    public Bst(){
        this.element=null;
        this.left=null;
        this.right=null;
    }

    //insertion method
    public void insert(T o){
        if(element.compareTo(o)<0){
            if(right==null){
                right=new Bst<T>(o);
            }else{
                right.insert(o);
            }
        }
        else if(element.compareTo(o)>0){
            if(left==null){
                left=new Bst<T>(o);
            }
            else{
                left.insert(o);
            }
        }
    }
    //creating constructor for deleting node from binary tree
    //there are three possible to delete an node
    //1)empty tree 2)having one child 3)having three child
    Bst <T> del(Bst<T> root, T key){
        //if the tree is empty
        if(root==null){
            return root;
         }
         if(root.element.compareTo(key)>0){
            root.left=del(root.left, key);
         }
         else if(root.element.compareTo(key)<0){
            root.right=del(root.right, key);
         }
         //if key is same as root's key then this node will be deleted
         else{
            //having one child or no childs
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //node with two children get the inorder successor
            root.element=inSucc(root.right);
            //deleting the inorder successor
            root.right=del(root.right, this.element);
         }
         return root;

    }
    //method for in-order successor
    public T inSucc(Bst <T>root){
        T minv=this.element;
        while(root.left!=null){
            minv=this.left.element;
            root=root.left;
        }
        return minv;
    }

    //searching element
    public Bst<T> search(T key){
        if(this.element.compareTo(key)==0){
            return this;
        }
        if(this.element.compareTo(key)>0){
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

    static void in_order(Bst r){
        if(r!=null){
            in_order(r.left);
            r.visit();
            in_order(r.right);
        }
    }
    static void pre_order(Bst r){
        if(r!=null){
            r.visit();
            pre_order(r.left);
            pre_order(r.right);
        }
    }
    static void post_order(Bst r){
        if(r!=null){
            post_order(r.left);
            post_order(r.right);
            r.visit();
        }
    }
    public void visit(){
        System.out.println(this.element+" ");
    }
    public static void main(String[] args) {
        Bst<Integer>ro=new Bst<>(4);
        ro.insert(12);
        ro.insert(1);
    }
}
