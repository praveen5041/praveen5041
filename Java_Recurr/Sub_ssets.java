import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Sub_ssets {
    //using the recurssions
    public static List<List<Integer>>Sub_s(int[] a,List<Integer>l,List<List<Integer>>ans,int i){
        ans.add(new ArrayList<>(l));
        for(int j=i;j<a.length;j++){
            l.add(a[j]);
            Sub_s(a, l, ans, i+1);
            l.remove(l.size()-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        List<List<Integer>>s_s=new ArrayList<>();
        List<List<Integer>>rec=new ArrayList<>();
        System.out.print(Sub_s(a, new ArrayList<>(), rec, 0));

        System.out.println("  ");
        s_s.add(new ArrayList<>());
        for(int i:a){
            int si=s_s.size();
            for(int j=0;j<si;j++){
                List<Integer>an=new ArrayList<>(s_s.get(j));
                an.add(i);
                s_s.add(an);
            }
        }
        System.out.println(s_s);
    }
}
