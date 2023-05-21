import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("praveen", 18);
        map.put("sai", 22);
        map.put("rama",34);
        map.put("praveen", 22);
        //Collection.
        if(map.containsKey("praveen")){
            System.out.println("existed");
        }
        else{
            System.out.println("does not exist");
        }
        System.out.println(map.get("sai"));
        System.out.println(map.get("loki"));
        System.out.println(map);
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+e.getValue());
        }
        Set<String>keys=map.keySet();
        for(String s:keys){
            System.out.println(s+" "+map.get(s));
        }
    }
}
