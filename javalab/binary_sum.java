import java.util.*;

public class binary_sum {
    public static void main(String[] args) {
        List<List<String>>s=new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        for(String e:strs){
            char ch[]=e.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(e);
            System.out.print(map+" ");
            System.out.println();
        }
        s.addAll(map.values());
        System.out.println( s);
    }

    

     
}
