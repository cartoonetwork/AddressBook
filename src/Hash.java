import java.util.HashMap;

public class Hash {
    //syntax
    //HashMap<type,value>h = new HashMap
    //h.put(data,value);
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("hello", 2);
        h.put("hello", 1);
        h.put("tejas",4);
        System.out.println(h);
    }
}
