import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LexicOrd {
    public static void main(String[] args) {
        String[] arr={"hi","welcome","done","sai"};
        int l=arr.length;
        System.out.println(l);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int count=0;
        for(int i=0;i<n;i++){
            // char[] c=str[i].toCharArray();
            // Arrays.sort(c);
            // char[] c1=str[i].toCharArray();
            // boolean b=false;
            for(int j=0;j<str[i].length()-1;j++){
                if(str[j][i]>str[j+1][i]){
                    count++;
                    break;
                }
                // if(c[j]!=c1[j]){
                // b=true;}
            }
            // if(b){
            //     count++;
            // }
        }
        System.out.println(count);
    }
}
