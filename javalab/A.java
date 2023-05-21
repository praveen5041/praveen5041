import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        String ans="1010";
        int n=ans.charAt(0);
        System.out.println(n);
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(23);
        a.add(41);
        System.out.println(a.get(1));
         int[][] arr={
            {1,2,3,4},
            {12,9,17},
            {22,89,13,17,1}
         };
         int t=89;
         int[] ans=find(arr,t);
         System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][] arr, int t){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==t){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
