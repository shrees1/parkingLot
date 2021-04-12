import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

  static HashMap<Character, Character> hmap;

  ValidParentheses() {
    this.hmap = new HashMap<>();
    this.hmap.put('(', ')');
    this.hmap.put('{', '}');
    this.hmap.put('[', ']');
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (hmap.containsKey(c)) {
        char top = stack.empty() ? '#' : stack.pop();
        if (top != hmap.get(c)) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }
}