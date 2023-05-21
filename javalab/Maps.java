import java.util.*;
import java.util.Map.Entry; 
public class Maps {
    
    public static void main(String[] args) {
       HashMap<Integer, String>m=new HashMap<>();
       Map<String,Integer>map=new HashMap<>();
       m.put(1, "praveen");
       m.put(2, "yes");
       map.put("key", 34);
       map.put("key1", 12);
       m.put(1, "welcome");
       System.out.println(m.entrySet());
       System.out.println(m.keySet());
       System.out.println(m);
       //iterating the map values and keys
       Set<Integer>s=m.keySet();
       Iterator<Integer>it=s.iterator();
       while(it.hasNext()){
        int ans=it.next();
        String value=m.get(ans);
        System.out.println("keys:"+ans+ "objects "+ value);
       }
       //searching key
       if(map.containsKey("key")){
        System.out.println("found");
       }
       else{
        System.out.println("not found");
       }
       //iteration in map
       for(Map.Entry<String, Integer>maps:map.entrySet()){
         System.out.println(maps.getKey());
         System.out.println(maps.getValue());
        System.out.println(maps);
       }
    }
}
