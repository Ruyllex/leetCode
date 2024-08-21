import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Minimum Time to Type Word Using Special Typewriter
There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer. 
A character can only be typed if the pointer is pointing to that character. 
The pointer is initially pointing to the character 'a'. 

Each second, you may perform one of the following operations:

    Move the pointer one character counterclockwise or clockwise.
    Type the character the pointer is currently on.

Given a string word, return the minimum number of seconds to type out the characters in word.
*/

public class $1974 {
    public static int minTimeToType(String word) {
        int time = 0;
        time = time + word.length();
        char start = 'a';
        for (char c : word.toCharArray()) {
            time += Math.min(Math.abs(start - c),26 - Math.abs(start - c));
            start = c;
        
        }
        return time;
    }
    @Test
    public void testMinTimeToType(){
        String word = "abc";
        int ans = 5;
        assertEquals(ans, $1974.minTimeToType(word));
    }
    @Test
    public void testMinTimeToType2(){
        String word = "bza";
        int ans = 7;
        assertEquals(ans, $1974.minTimeToType(word));
    }
    @Test
    public void testMinTimeToType3(){
        String word = "zjpc";
        int ans = 34;
        assertEquals(ans, $1974.minTimeToType(word));
    }
    
}
