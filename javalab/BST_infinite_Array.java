public class BST_infinite_Array {
    static int bst(int[] nums, int t, int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<nums[m]){
                 e=m-1;
            }
            else if(t>nums[m]){
                s=m+1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
    static int res(int[] nums,int t){
        int s=0;
        int e=1;
        while(t>nums[e]){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return bst(nums, t, s, e);
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,130,140,160,170};
        int t=10;
        System.out.println(res(arr, t));
    }
}
