public class bst {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,7};
        int t=9;
        System.out.println(search(nums, t, 0, nums.length-1));
    }
    static int search(int[] nums,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(t==nums[m]){
            return m;
        }
        if(t<nums[m]){
            return search(nums, t, s, m-1);
        }
        return search(nums, t, m+1, e);
    }
}
