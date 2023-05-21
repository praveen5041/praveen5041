import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
  static List<Integer> Tri(int r){
        List<Integer>l=new ArrayList<>();
        l.add(1);
        if(r==0){
            //System.out.println(l);
            return l;
        }
      //  System.out.println(Tri(r-1));
        List<Integer>nextr=Tri(r-1);
        //System.out.println("get values");
        
        for(int i=0;i<nextr.size()-1;i++){
           // System.out.print(nextr.get(i)+" ");
            l.add(nextr.get(i)+nextr.get(i+1));
        }
        l.add(1);
        return l;

    }
    public static void main(String[] args) {
        String s="121";
        String str="11";
        str.substring(0, 0)
        int ans=1;
        for(int i=s.length()-1;i>=0;i--){
            int v=s.charAt(i)-48;
            ans=ans*10+v;
        }
        String res=(String)ans;
        System.out.println(ans);
        int r=4;
         System.out.println(Tri(r));
    }
}
