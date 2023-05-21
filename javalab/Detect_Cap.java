import java.util.Scanner;

 

public class Detect_Cap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
            c++;
        }
        if(c==1&&Character.isUpperCase(str.charAt(0)))
        System.out.println("yes");
        else if(c==0||c==str.length())
        System.out.println("yes");
        else
        System.out.println("No");
    }
}
