import java.util.Scanner;

public class Char_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println(fun(s, s1, s.length()-1, s1.length()-1));
    }
    static int fun(String s,String s1, int i, int j){
        if(i<0){
            return i+1;
        }
        if(j<0){
            return j+1;
        }
        if(s.charAt(i)==s1.charAt(j)){
            return fun(s,s1,i-1,j-1);
        }
        return 1+Math.min(fun(s, s1, i-1, j-1),Math.min(fun(s, s1, i-1, j),fun(s, s1, i, j-1)))
    }
}
