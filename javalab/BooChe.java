import java.util.*;

public class BooChe {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));
       // int[] a=arr;
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i], 0);
        }
        System.out.println(ans.keySet());
    }
}
