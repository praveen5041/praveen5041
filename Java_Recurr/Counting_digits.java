
public class Counting_digits {
    public static void main(String[] args) {
        System.out.println(counts(10230));
    }
    static int counts(int n){
        return help(n,0);
    }
    static int help(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return help(n/10, c+1);
        }
        return help(n/10, c);
    }
}
