import org.junit.Test;

/*
Remove Outermost Parentheses

A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings,
and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, 
with A and B nonempty valid parentheses strings.
Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, 
where Pi are primitive valid parentheses strings.
Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
*/


public class $1021  {
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int aux = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (aux > 0) {
                    ans.append(s.charAt(i));
                }
                aux++;
            } else if (s.charAt(i) == ')') {
                aux--;
                if (aux > 0) {
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
    @Test
    public void testRemoveOuterParentheses(){
        String s = "(()())(())";
        String ans = "()()()";
        ans.equals($1021.removeOuterParentheses(s));
    }
    @Test
    public void testRemoveOuterParentheses2(){
        String s = "(()())(())(()(()))";
        String ans = "()()()()(())";
        ans.equals($1021.removeOuterParentheses(s));
    }
    @Test
    public void testRemoveOuterParentheses3(){
        String s = "()()";
        String ans = "";
        ans.equals($1021.removeOuterParentheses(s));
    }
}
