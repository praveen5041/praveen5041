import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        int[] nums={1,2,2,2,3,4,5,2,6};
        int t=2;
       // System.out.println(find(nums,t,0,new ArrayList<>()));
        System.out.println(findIdx(nums, t, 0));
    }
    static ArrayList<Integer>find(int[] nums,int t,int c,ArrayList<Integer>list){
        if(c==nums.length){
            return list;
        }
        if(nums[c]==t){
            list.add(c);
        }
        return find(nums, t, c+1, list); 
    }
     
    //function to without using list as argument
    static ArrayList<Integer>findIdx(int[] nums,int t,int c){
        ArrayList<Integer>list=new ArrayList<>();
        if(c==nums.length)
        return list;
        if(nums[c]==t){
            list.add(c);
        }
        ArrayList<Integer>ans_from_belowCalls=findIdx(nums, t, c+1);
        list.addAll (ans_from_belowCalls);
        return list;

    }
    
}
