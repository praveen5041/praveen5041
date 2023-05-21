import java.util.HashMap;
import java.util.Map;

public class Hash_mapped {
    public static void main(String[] args) {
        HashMap<Integer,Integer>ma=new HashMap<>();
        int[] arr={1,2,3,1,2,3,4,0,5};
        for(int i=0;i<arr.length;i++){
            if(ma.containsKey(arr[i])){
                ma.put(arr[i], ma.get(arr[i])+1);
            }
            else{
                ma.put(arr[i],1);
            }
        }
        
    }
}
