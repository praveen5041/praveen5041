class Order_Agnostic{
    static int order_agnostic(int[] nums,int t){
        int s=0;
        int e=nums.length-1;
        boolean isagno=nums[s]<nums[e];
        while(s<=e){
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
        int[] nums={12,13,15,18,21,23,25,30};
        int t=23;
        System.out.println(order_agnostic(nums,t));
    }
}