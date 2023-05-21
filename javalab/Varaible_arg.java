import java.util.Arrays;

class Varaible_arg{
    public static void main(String[] args) {
        fun(1,2,3,4);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}