public class StaticMethod {
    int num;
    StaticMethod(){
        this(10);
        this.show();
    }
    StaticMethod(int b){
        this.num=b;
    }
    void show(){
        System.out.println(this.num);
    }
    public static void main(String[] args) {
        StaticMethod s=new StaticMethod();
       // System.out.println("static method");
    }
    // static{
    //     System.out.println("this is static block");
    // }
}
