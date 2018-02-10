import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class opgave14 {

    public static void main(String[] args) {

        Map<String,Integer> a = new ConcurrentHashMap<>(); // fik fejl medmindre jeg brugte ConcurrentHashMap
        Map<String,Integer> b = new ConcurrentHashMap<>();

        a.put("Jesper",200);
        b.put("Jesper",200);
        a.put("Kasper",500);
        b.put("Kasper",300);
        a.put("Andreas",500000);
        b.put("Andreas",500000);

        intersect(a,b);

    }

    public static Map intersect(Map<String,Integer> a, Map<String,Integer> b)
    {
        Map<String,Integer> C = new HashMap<>();



        for(String k: a.keySet()){
            for(Integer j: a.values()) {
                if (b.containsValue(j) == a.containsValue(j) && b.containsKey(k) == a.containsKey(k)) { // tjekker om key og value passer


                } else { // ellers fjerner den begge værdier
                    a.remove(k);
                    b.remove(k);
                }
            }
        }
        C.putAll(a);
        C.putAll(b); // smider hele svineriget ind i C
        System.out.println(C); // udskriver C

        return C;
    }
}
