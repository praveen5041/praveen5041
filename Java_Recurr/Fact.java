public class Fact {
    public static void main(String[] args) {
        fact1(36);
    }
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void fact1(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
