

public class Stacks2<T> {
     Linkedlist<T>top;//header to the list
     int l;
     Stacks2(){
        top=new Linkedlist<>();
        l=0;
     }
     boolean isEmpty(){
        if(this.top==null){//this.top.isEmpty();
            return true;
        }
        else{
            return false;
        }
     }
     void push(T data){
        l+=1;
        this.top.insertFront(data);
     }
     //pop operations;
     T pop(){
        T x=null;
        if(!isEmpty()){
            l-=1;
            this.top.deletion_fr();
        }
        else{
            System.out.println("stack is under flow");
        }
        return x;
     }
    //printing the stack
    void print_stack(){
        if(this.top==null){
            System.out.println("stack is empty");
        }
        else{
            this.top.print_list();
        }
    }

    //conversion of infix expression to postfix expression
    //conversion of postfix express evalution
    
    public static void main(String[] args) {
        Stacks2<Integer>l=new Stacks2<>();
        l.push(12);
        l.push(23);l.push(39);
        l.print_stack();
    }
}
