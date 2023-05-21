package subsets;
import java.util.*;
public class Subset {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcme");
		int[] arr={1,2,4};
        List<List<Integer>>ans=subsets(arr);
        for(List<Integer>l:ans){
            System.out.println(l);
        }
	}
	static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:arr){
            for(int j=0;j<outer.size();j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }

}
