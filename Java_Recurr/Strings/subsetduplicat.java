package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;;
public class subsetduplicat {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>>ans=Subset_Dup(arr);
        for(List<Integer>l:ans){
            System.out.println(l);
        }
    }
    static List<List<Integer>> Subset_Dup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:nums){
            for(int j=0;j<outer.size();j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }
}
