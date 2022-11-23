import java.io.IOException;
import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.transform.Source;

public class Btree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    static class Binary{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    //to print preorderd;
    public static void preorderd(Node root){
        
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorderd(root.left);
        preorderd(root.right);
    }
    //inorderd
    public static void inorderd(Node root){
        if(root==null){
            return ;
        }
        inorderd(root.left);
        System.out.print(root.data+" ");
        inorderd(root.right);
    }
    //post ordered
    public static void postordered(Node root){
        if(root==null){
            return;
        }
        postordered(root.left);
        postordered(root.right);
        System.out.print(root.data+" ");
    }
    //level ordered or bfs
    public static void bfs(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
         q.add(root);
         q.add(null);
        while(!q.isEmpty()){
            Node cuur=q.remove();
            if(cuur==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else
                q.add(null);
            }
            else{
                System.out.println(cuur.data+" ");
                if(cuur.left!=null){
                    q.add(cuur.left);
                }
                if(cuur.right!=null){
                    q.add(cuur.right);
                }
            }
        }
    
    }
    //calculating the number of nodes
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int lnodes=countOfNodes(root.left);
        int rnodes=countOfNodes(root.right);
        return lnodes+rnodes+1;
    }

    //sum of nodes
    public static int sumN(Node root){
        if(root==null){
            return 0;
        }
        int lsum=sumN(root.left);
        int rsum=sumN(root.right);
        return lsum+rsum+root.data;
    }

    //hight of the trees 

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lheight=height(root.left);
        int rheigh=height(root.right);
        int h=Math.max(lheight,rheigh)+1;
        return h;
    }

    //to find the maximum diameter O(n*2)
    public static int maxDiameter(Node root){
        if(root==null){
            return 0;
        }
        int ldia=maxDiameter(root.left);
        int rdia=maxDiameter(root.right);
        int mheight=height(root.left)+height(root.right)+1;
        return Math.max(mheight,Math.max(ldia, rdia));
    }

    //second approach to find the diameter in O(n)
    static class TreeDia{
        int h;
        int d;
        TreeDia(int h,int d){
            this.h=h;
            this.d=d;
        }
    }
    public static TreeDia maxDia(Node root){
        if(root==null){
          return  new TreeDia(0,0);
        }
        TreeDia left=maxDia(root.left);
        TreeDia right=maxDia(root.right);
        int heigh=Math.max(left.h, right.h)+1;
        int d1=left.d;
        int d2=right.d;
        int d3=left.h+right.h+1;
        int maxdia=Math.max(Math.max(d1, d2), d3);
        TreeDia info=new TreeDia(heigh, maxdia);
        return info;
    }
    public static void main(String[] args) throws IOException{
        int a[]={1,2,4,-1,-1,5,-1,-1,3,-1, 6,-1,-1};
        Binary b=new Binary();
        Node r= b.buildTree(a);
        System.out.print(r.data+" ");System.out.println("preo");
        preorderd(r);
        System.out.println("inore");
        inorderd(r);
        System.out.println("post");
        postordered(r);
        System.out.println("level");
        bfs(r);
        System.out.println("nnodes"+countOfNodes(r));
        System.out.println("sum "+sumN(r));
        System.out.println("Height"+height(r));
        System.out.println("Max Diameter"+maxDiameter(r));
        System.out.println("second approach "+maxDia(r).d);
    }
}
