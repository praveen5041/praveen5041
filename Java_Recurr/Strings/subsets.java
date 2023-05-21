package Strings;
import java.util.*;
public class subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>>list=Duplica(arr);
        for(List<Integer>l:list){
            System.out.println(l);
        }
    }

    //subsets duplicate eliments
    static List<List<Integer>>Duplica(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0&&arr[i]==arr[i-1]){
                s=e+1;
            }
            e=outer.size()-1;
            for(int j=s;j<outer.size();j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }

    // static List<List<Integer>>sub(int[] arr){
    //     List<List<Integer>>outer=new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     for(int i:arr){
    //         for(int j=0;j<outer.size();j++){
    //             List<Integer>inner=new ArrayList<>(outer.get(j));
    //             inner.add(i);
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;
    // }
    // static List<List<Integer>> Subsets(int[] arr){
    //     List<List<Integer>>outer=new ArrayList<>();
    //     outer.add(new ArrayList<>());

    //     for(int i:arr){
    //         for(int j=0;j<outer.size();j++){
    //         List<Integer>inner=new ArrayList<>(outer.get(j));
    //         inner.add(i);
    //         outer.add(inner);
    //         }

    //     }
    //     return outer;
    // }
}


//time complexity O(N*2 power N)
//space complexity O(2 power N*N)
