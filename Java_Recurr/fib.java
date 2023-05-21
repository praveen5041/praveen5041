public class fib {
    public static void main(String[] args) {
         System.out.println(fid(25));
    }
    static int fi(int n){
        if(n<2){
            return n;
        }
         return fi(n-1)+fi(n-2);
    }
    static int fid(int n){
        
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
    }
}
