import java.util.*;
class Strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        //System.out.println(s+" "+s1);
        System.out.println(s.length());
        // if(s.compareTo(s1)==0){
        //     System.out.println("strings are equals");
        // }
        // else{
        //     System.out.println("strings are not equal");
        // }

        //strings are passed primitive types
        if(new String("hi")==(new String("hi") ) ){
            System.out.println("are equal");
        }
        else{
            System.out.println("not equal");
        }
        //substrngs
        String sub=sc.nextLine();
        String name=sub.substring(11,sub.length());
        System.out.println(name);
    }
}