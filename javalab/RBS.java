import java.util.EnumSet;

public class RBS {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(Pivot(nums));
        
    }
    static int searching(int[] nums, int t){
        int p=Pivot(nums);
        if(p==-1){
            return bst(nums, t,0,nums.length-1);
        }
        if(nums[p]==t){
            return p;
        }
        if(t>=nums[0]){
            return bst(nums, t, 0, p-1);
        }
        return bst(nums, t, p+1, nums.length-1);
    }
    static int bst(int[] nums,int t,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<nums[m]){
                e=m-1;
            }
            else if(t>nums[m]){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
    static int Pivot(int[] nums){
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e&&nums[m]>nums[m+1]){
                return m;
            }
            if(m>s&&nums[m]<nums[m-1]){
                return m;
            }
            if(nums[m]<=nums[s]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
}
