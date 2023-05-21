public class Peak_mountain {
    static int bst(int[] nums){
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>nums[m+1]){
                e=m;
            }
            else{
                s=e+1;
            }
        }
        return s;
    }
   static int ans(int[] nums,int t){
        int p_element=bst(nums);
        int res=order_agnostic(nums,t,0,p_element);
        if(res!=-1){
            return res;
        }
        return order_agnostic(nums, t, p_element+1, nums.length-1);
    }
    static int order_agnostic(int[] nums,int t,int s,int e){
        // int s=0;
        // int e=nums.length-1;
        boolean isagno=nums[s]<nums[e];
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                return mid;
            }
            if(isagno){
                if(t<nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(t>nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int t=3;
        System.out.println(ans(arr, t)) ;
    }   
}



