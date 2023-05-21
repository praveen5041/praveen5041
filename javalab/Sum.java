import java.util.*;

public class Sum {
    public static void main(String[] args) {
        String str="123";
        String str1="99";
        int i=str.length()-1;
        int j=str1.length()-1;
        int sum=0;
        for(int k=0;k<=i;k++){
            
            int ans=str.charAt(k)-48*(int)Math.pow(10, i-k);
            System.out.println(ans);
            sum+=ans;
        }
        System.out.println(sum);

        int[] a={9,9,9,9,9,9,9,9,9,9};
        int l=a.length;
        int t=l;
        long s=0;
        // for(int i=0;i<l;i++){
        //     int p=(int)Math.pow(10,t-1);
        //     t--;
        //      s+=p*a[i];
        //      System.out.println(s);
        // }
        s+=1;
        System.out.println(s);
        List<Long>ans=new ArrayList<Long>();
        while(s>0){
            long r=s%10;
            ans.add(r);
            s/=10;

        }
        Collections.reverse(ans);
        System.out.println(ans);
         
    }

}
