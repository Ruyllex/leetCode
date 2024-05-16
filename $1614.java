
/*
Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class $1614{
    public static int maxDepth(String s) {
        int max = 0;
        int aux = 0;
        for(int i = 0; i != s.length();i++){
            if(s.charAt(i) == '('){
                aux++;
                if(aux > max){
                    max = aux;
                }
            }
            if(s.charAt(i) == ')'){
                aux--;
            }
        }
        return max;
    }
    @Test
    public void testMaxDepth(){
        String s = "(1+(2*3)+((8)/4))+1";
        int ans = 3;
        assertEquals(ans, $1614.maxDepth(s));
    }
    @Test
    public void testMaxDepth2(){
        String s = "(1)+((2))+(((3)))";
        int ans = 3;
        assertEquals(ans, $1614.maxDepth(s));
    }    @Test
    public void testMaxDepth3(){
        String s = "()(())((()()))";
        int ans = 3;
        assertEquals(ans, $1614.maxDepth(s));
    }

}