public class RBST {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int t=0;
        System.out.println(search(nums,t, 0,nums.length-1));
    }
    static int search(int[] nums,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if((nums[s]==nums[m])&&(nums[e]==nums[m])){
            return search(nums, t, m+1, m-1);
        }
        if(nums[m]==t){
            return m;
        }
        if(nums[s]<nums[m]){
            if(t>=nums[s]&&t<nums[m]){
                return search(nums, t, s, m-1);
            }
            else{
                return search(nums, t, m+1, e);
            }
        }
        if(t>nums[m]&&t<=nums[e]){
            return search(nums, t, m+1, e);
        }
        return search(nums, t, s, m-1);

//for boolean datatype
        // boolean l=search(nums, t, s, m-1);
        // boolean r=search(nums, t, m+1, e);
        // if(l==true||r=true){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}
