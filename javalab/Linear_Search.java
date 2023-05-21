public class Linear_Search {
    public static void main(String[] args) {
        int[] nums={12,12,11,14,100};
        int t=4;
       //boolean b= linear_serach(nums, t);
       System.out.println(linear_serach(nums, t));
    }
    static boolean linear_serach(int[] nums,int t){
        if(nums.length==0)
        return false;
        for(int i:nums){
            if(i==t){
                return true;
            }
        }
        return false;
    }
}
