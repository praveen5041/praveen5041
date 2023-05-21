import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] nums={4,33,2,16};
        // bubble(nums, nums.length-1, 0);
        // System.out.println(Arrays.toString(nums));
         sele(nums, nums.length-1, 0, 0);
         System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] nums,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(nums[c]>nums[c+1]){
                int t=nums[c];
                nums[c]=nums[c+1];
                nums[c+1]=t;
            }
            bubble(nums, r, c+1);
        }
        else{
            bubble(nums, r-1, 0);
        }
    }

    //selection sort
    static void sele(int[] nums,int r,int c,int m){
        if(r==0){
            return;
        }
        if(c<r){
        if(nums[c]>nums[m]){
            sele(nums, r, c+1, c);
        }
        else{
            sele(nums, r, c+1, m);
        }
        }
        else{
            int t=nums[m];
            nums[m]=nums[r-1];
            nums[r-1]=t;
            sele(nums, r-1, 0, 0);
        }
    }
}
