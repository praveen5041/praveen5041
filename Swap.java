public class Swap {
    public void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping"+a+" "+b);
    }
    public static void main(String[] args) {
        Swap s=new Swap();
        s.swap(10, 20);
    }
}
