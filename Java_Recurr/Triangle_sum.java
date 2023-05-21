import java.util.Arrays;

public class Triangle_sum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        sum(nums);
        //System.out.println(Arrays.toString(nums));
    }
    static void sum(int[]nums){
        if(nums.length<1){
            return;
        }
        int[] t=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            t[i]=nums[i]+nums[i+1];
        }
        sum(t);;
        System.out.println(Arrays.toString(t));
    }
}
