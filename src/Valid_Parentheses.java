import java.util.*;
import java.util.PriorityQueue;

/**
 * Created by yamahachou on 2019/4/3.
 */
public class Valid_Parentheses {

    private static Map<Character, Character> hashmap = new HashMap<>();

    public static boolean isValid(String s){
        hashmap.put('}', '{');
        hashmap.put(']', '[');
        hashmap.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ;i < s.length(); i++){
            char c = s.charAt(i);

            if(hashmap.containsKey(c)){
                char topElement = stack.isEmpty()? '#' : stack.pop();

                if(topElement != hashmap.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return true;
    }

    public static void main(String[] avgs){
        String s = "{[]}";
        System.out.println(isValid(s));

        PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(2, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a - b;
            }
        });
    }
}
