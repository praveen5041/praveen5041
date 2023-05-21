import java.util.Arrays;

public class RowCol_mat {
    public static void main(String[] args) {
        int nums[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        int t=21;
        int[] ans=mat(nums, t);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mat(int[][] nums, int t){
        int r=0;
        int c=nums.length-1;
        while(r<=nums.length-1&&c>=0){
            if(nums[r][c]==t){
                return new int[]{r,c};
            }
            if(nums[r][c]>t){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
