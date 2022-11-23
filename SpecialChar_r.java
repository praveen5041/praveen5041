import java.util.*;
public class SpecialChar_r {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        String str="a bc d&^@bbf ";
        String s="";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))&&Character.isWhitespace(str.charAt(i))){
                continue;
            }
            else{
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
