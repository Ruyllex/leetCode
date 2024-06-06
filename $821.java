
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
/*
Shortest Distance to a Character

Given a string s and a character c that occurs in s, return an array of integers answer where answer.
length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
*/


public class $821{
    public static int search(String s, char c , int index){
        int left = index;
        int right = 0;
        int auxl = index + 1;
        int auxr = index;
        if(index == 0){
            for(int i = 0; i != s.length();i++){
                if(s.charAt(i) == c){
                    return i;
                }
            }
        }
        while( auxl != 0 && left == index){
            auxl--;
            if(s.charAt(auxl) == c){
                left = auxl;
            }
            
        }
        if(auxl == 0 && left != 0){
            left = 1000;
        }
        while(auxr != s.length() && right == 0){
            if(s.charAt(auxr) == c){
                right = auxr;
            }
            auxr++;
        }
        if(auxr == s.length() + 1){
            right = 100;
        }
        return Math.min(Math.abs(index - left),Math.abs(right - index));
    }
    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        for(int k = 0; k != s.length(); k++){
            ans[k] = search(s,c,k);
        }
        return ans;
    }
    @Test
    public void testShortestToChar(){
        String s = "loveleetcode";
        char c = 'e';
        int[] ans = {3,2,1,0,1,0,0,1,2,2,1,0};
        assertArrayEquals(ans, $821.shortestToChar(s,c));
    }
    @Test
    public void testShortestToChar2(){
        String s = "aaab";
        char c = 'b';
        int[] ans = {3,2,1,0};
        assertArrayEquals(ans, $821.shortestToChar(s,c));
    }
    @Test
    public void testShortestToChar3(){
        String s = "abaa";
        char c = 'b';
        int[] ans = {1,0,1,2};
        assertArrayEquals(ans, $821.shortestToChar(s,c));
    }
    @Test
    public void testShortestToChar4(){
        String s = "baab";
        char c = 'b';
        int[] ans = {0,1,1,0};
        assertArrayEquals(ans, $821.shortestToChar(s,c));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$821");
    }
    
}
