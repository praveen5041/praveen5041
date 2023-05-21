import java.util.*;

public class Strin_Add {
   public static boolean isPalin(String str){
        int s=0,l=str.length()-1;
        while(s<l){
            if(str.charAt(s++)!=str.charAt(l--)){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    String test="abscd";
    System.out.println(test.substring(0));
    System.out.println(test.substring(1));
    System.out.println(test.substring(2));
    
    System.out.println(isPalin("abcba"));
    StringBuilder sb=new StringBuilder();
    String str="11";
    String str2="9";
    int c=0;
    int i=str.length()-1;
    int j=str2.length()-1;
    String res="";
    while(i>=0||j>=0||c!=0){
        int x=i>=0?str.charAt(i)-48:0;
        int y=j>=0?str2.charAt(j)-48:0;
        int sum=x+y+c;
       // sb.append(sum%10);
       res+=sum%10;
        c=sum/10;
        i--;j--;
    }
    
    //sb.reverse().toString();
    System.out.println(sb);
    // while(i>=0||j>=0){
    //     if(i<0){
    //         int x=(str2.charAt(j)-48+c)%10;
    //         sb.append(x+c+48);
    //         c=x/10;
    //         j--;
    //     }
    //     else if(j<0){
    //         int x=(str.charAt(i)-48+c)%10;
    //         sb.append(x+c+48);
    //         c/=10;
    //         i--;
    //     }
    //     else{
    //         int x=str.charAt(i)-48;
    //         int y=str2.charAt(j)-48;
    //         sb.append((x+y+c+48)%10);
    //         c/=10;

    //     }
    // }
    System.out.println(sb);
}
}
