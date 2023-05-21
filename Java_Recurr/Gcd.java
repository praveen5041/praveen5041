public class Gcd {
    public static void main(String[] args) {
      //  System.out.println(gcd(4, 9));
        //System.out.println(lcm(9, 18));
        int ans='1'-0;
        System.out.println(ans);
        String a="hi";
        String b="hi";
        double num=1.2455f;
        System.out.printf("%.2f",num);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String a1=new String("hi  ");
        String b1=new String("hi");
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a, b);
    }

}
