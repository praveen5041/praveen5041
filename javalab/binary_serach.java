public class binary_serach {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int t=15;
        System.out.println(search(arr,t));
    }
    public static int search(int[] nums, int t){
        int s=0;
        int e=nums.length-1;
       
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<nums[m]){
                 e=m-1;
            }
            else if(t>nums[m]){
                s=m+1;
            }
            else 
            return m;
        }
        //int ans=nums[s];
       // return nums[s];
       return nums[e];
    }
}
