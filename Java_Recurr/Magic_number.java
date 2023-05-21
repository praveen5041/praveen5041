public class Magic_number {
    public static void main(String[] args) {
        int ans=0;
        int base=5;
        int n=4;
        int n1=123;
        int b=2;
        int c= (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(c);
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
