import java.io.IOException;
import java.util.ArrayList;

public class BSTyt {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            this.data=value;
        }
    }
   public static Node insert(Node root,int value){
    if(root==null){
        root=new Node(value);
        return root;
    }
    if(root.data>value){
        root.left= insert(root.left, value);
    }
    else{
        root.right=insert(root.right,value);
    }
    return root;
   }
   //printing the inorder
   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   }
   //searching
   public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data>key){
        return search(root.left,key);
    }else if(root.data==key){
        return true;
    }
    else{
        return search(root.right, key);
    }
   }

   //deletion
   //3 possibles
   //no child
   //one child
   //two childs
   //inorder successor allways have either 1 or 0 childs
   public static Node delete(Node root,int key){
    
     if(root.data>key){
        root.left=delete(root.left, key);
     }

     else if(root.data<key){
        root.right=delete(root.right, key);
     }
     else{
        //case 1
        if(root.left==null&&root.right==null){
            return null;
        }
        //case 2:
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
       // case 3:
        Node IS=inorderSuccessor(root.right);
        root.data=IS.data;
        root.right=delete(root.right, IS.data);
     }
     return root;
   }

   //inorder successor
   public static Node inorderSuccessor(Node root){
        while(root.left!=null){
                root=root.left;
        }
        return root;
   }

   //printing the between range
   public static void inrange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x&&root.data<=y){
        inrange(root.left, x, y);
        System.out.print(root.data+" ");
        inrange(root.right, x, y);
    }
    else if(root.data>=y){
        inrange(root.left, x, y);
       // System.out.println(root.data);
    }
    else{
        inrange(root.right, x, y);;
    }
   }
//printing path
public static void printPaths(ArrayList<Integer>path){
    path.forEach(System.out::println);
}
   //printing path from t=root to leaf 
   public static void printPath(Node root,ArrayList<Integer>path){
    if(root==null){
        return;
    }
    path.add(root.data);
    //leaf nodes
    if(root.left==null&&root.right==null){
        System.out.println("paths are");
        printPaths(path);
    }
    else{//non leaf
    printPath(root.left, path);
    printPath(root.right, path);
    }
    path.remove(path.size()-1);
   }
    public static void main(String[] args)throws IOException{
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
         ArrayList<Integer>list=new ArrayList<>();
         list.add(12);list.add(1);list.add(9);list.add(18);list.add(14);
        //  list.forEach(System.out::print);
         //inserting elements int binary search tree
         //int[] list={12,1,9,13,12,4,5};
         Node root=null;
         for(int i:list){
            System.out.print(i+" ");
            root=insert(root, i);
         }
         inorder(root);
         //System.out.println();
         if(search(root, 12)){
            System.out.println("found");
         }
         else
         System.out.println("not found");
         delete(root, 9);
         inorder(root); 
         System.out.println();
         System.out.println(list);
        inrange(root, 10, 15);
        printPath(root, list);
    }

}
