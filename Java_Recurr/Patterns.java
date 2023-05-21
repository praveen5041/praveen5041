public class Patterns {
    public static void main(String[] args) {
       // fun(5 ,0);
       //triangle(5, 0);
       zad(3, 0);
    }
    static void fun(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            fun(r, c+1);
        }
        else{
            System.out.println();
            fun(r-1,0);
        }
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle(r, c+1);
            System.out.print("*");
        }else{
            triangle(r-1, 0);
            System.out.println();
        }
    }
    static void zad(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*"+" ");
            zad(r, c+1);
            
        }
        else{
            System.out.println();
            zad(r-1,  );
        }
        
    }
}
