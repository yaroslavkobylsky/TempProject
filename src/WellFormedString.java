import java.util.ArrayDeque;
import java.util.Deque;

public class WellFormedString {

    public static int result(String s){
        Deque<Character> characters = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            switch (c){
                case '(': characters.addFirst(c);
                    break;
                case '{': characters.addFirst(c);
                    break;
                case '[': characters.addFirst(c);
                    break;
                case ')': if (characters.getFirst() != '(') {
                    return 0;
                }
                case '}': if (characters.getFirst() != '{') {
                    return 0;
                }
                case ']': if (characters.getFirst() != '[') {
                    return 0;
                }
                    break;
                default:break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String formedString = "{[(0)]}";
        System.out.println("result: " + result(formedString));
    }
}
