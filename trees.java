public class trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static  class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;

        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static int countnodes(Node root){
        if(root==null){
            return 0;
        }
        int lnodes=countnodes(root.left);
        int rnodes=countnodes(root.right);
        return lnodes+rnodes+1;
    }
    //sum of nodes
    public static int sumnodes(Node root){
        if(root==null){
            return 0;
        }
        int sleft=sumnodes(root.left);
        int sright=sumnodes(root.right);
        return sleft+sright+root.data;
    }
    //height of the binary tree
    public static int treeheight(Node root){
        if(root==null){
            return 0;
        }
        int lheight=treeheight(root.left);
        int rheight=treeheight(root.right);
        int m=Math.max(lheight, rheight)+1;
        return m;
    }
    //diameter if the tree
    public static int treediameter(Node root){
        if(root==null){
            return 0;
        }
        int ldai=treediameter(root.left);
        int rdai=treediameter(root.right);
        int total=ldai+rdai+1;
        int total=treeheight(root.left)+treeheight(root.right)+1;
        return Math.max(total,Math.max(ldai,rdai));
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(nodes);
        //System.out.println(root.data);
       // preorder(root);
       // inorder(root);
       //postorder(root);
       //System.out.println(countnodes(root));
      // System.out.println(sumnodes(root));
      //System.out.println(treeheight(root));
      System.out.println(treediameter(root));
    }
}
