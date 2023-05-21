public class Sorted {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,22,78};
        System.out.println(isSorted(nums, 0));
    }
    static boolean isSorted(int[] nums,int c){
        if(c==nums.length-1){
            return true;
        }
        // if(nums[c]<nums[c+1]){
        //     return isSorted(nums, c+1);
        // }
        // return false;
        
        //instead of above
        return nums[c]<nums[c+1]&&isSorted(nums, c+1);

    }
}
