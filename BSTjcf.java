import java.util.*;
public class BSTjcf {
    public static void main(String[] args) {
        //List<Integer>list=new ArrayList<>(Arrays.asList(1,12,78,10,89,15));
       int list[]={12,78,9,10,1};
        int x=12;
        Arrays.sort(list);
        System.out.println("found"+Arrays.binarySearch(list, x));
    }
}
