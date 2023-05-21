public class Linear_ser {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int t=4;
        System.out.println(search(nums, t, 0));
    }
    static boolean search(int[] nums,int t,int c){
        if(c==nums.length){
            return false;
        }
        if(nums[c]==t)
        return true;
        return search(nums, t, c+1);
       // return search(nums, t, c+1)||nums[c]==t;
    }
}
