package InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String,Integer> context = new HashMap<>();

    public void add(String s, Integer i) {
        context.put(s,i);
    }

    public int get(String s) {
        return context.get(s);
    }

}
