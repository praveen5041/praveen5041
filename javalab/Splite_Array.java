public class Splite_Array {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
       System.out.println(find(nums, k)); 
    }
    static int find(int[] nums, int n){
        int s=0,e=0;
        for(int i:nums){
            s=Math.max(s, i);
            e+=i;
        }
        while(s<e){
            int sum=0;
            int count=1;
            int m=s+(e-s)/2;
            for(int i:nums){
                if(sum+i>m){
                    sum=i;
                    count++;
                }
                else{
                    sum+=i;
                }
            }
            if(count>n){
                s=n+1;
            }
            else{
                e=m;
            }
        }
        return e;
    }
}
