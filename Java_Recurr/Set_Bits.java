public class Set_Bits {
    public static void main(String[] args) {
        int n=23;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbit(n));
    }
    static int setbit(int n){
         
        int c=0;
        while(n>0){
            if((n&1)==1){
            c++;
            }
            //n-=n&-n;
            n=n>>1;
        }
        return c;
    }
}
