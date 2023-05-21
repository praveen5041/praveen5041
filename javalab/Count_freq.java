 
import java.util.*;
public class Count_freq {
    public static void main(String[] args) {
        int[] arr={10,20,20,10,3,3};
        int n=arr.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i]))
            m.put(arr[i], m.get(arr[i])+1);
            else
            m.put(arr[i],1);
        }
        int c=0;
        for(int count:m.values()){
            if(count==1){
                System.out.println("-1");
            }
            if(count%3==0){
                c+=count/3;
            }
            else{
                c+=count/3+1;
            }
        }
        System.out.println(c);
        //  Map<String,Integer>m=new HashMap<>();
        //  m.put("hi", 1);
        //  m.put("wel", 2);
        //  m.put("come", 3);
        // System.out.println(m.containsKey("hi"));
        // System.out.println(m.get("hi"));
         
   }
}
