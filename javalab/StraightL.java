import java.util.Arrays;
import java.util.*;
public class StraightL {
    public static void main(String[] args) {
        int[][] arr={{1,1},{5,3},{1,4},{2,3},{3,2},{4,1}};
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        System.out.println(arr.length);
        Map<Integer,Integer>mp =new HashMap<>();
       // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            
             mp.put(arr[i][0],arr[i][1]);
        }
        System.out.println(mp.size());
       
    System.out.println(mp);
    }
}
class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i<points.length; ++i){
            Map<Double, Integer> check = new HashMap<>();
            for (int  j = i+1; j<points.length; ++j){
                double slope;
                if (points[i][0] == points[j][0])
                    slope = Double.MAX_VALUE;
                else{
                    slope = (points[i][1] - points[j][1]) / ((double) (points[i][0] - points[j][0]));
                    if (slope == -0.0)
                        slope = 0.0;
                }
                check.put(slope, check.getOrDefault(slope, 0) + 1);
                ans = Math.max(ans, check.get(slope));
            }
        }
        return ans+1;
    }
}