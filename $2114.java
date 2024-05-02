import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
*/

public class $2114 {
    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(int i = 0; i != sentences.length; i++){
            String []p = sentences[i].split(" ");
            int aux = p.length;
            if(ans < aux){
                ans = aux;
            }
        }
        return ans;
    }

    @Test
    public void testMostWordsFound2(){
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = 6;
        assertEquals(ans, $2114.mostWordsFound(sentences));
    }
    @Test
    public void testMostWordsFound(){
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int ans = 3;
        assertEquals(ans, $2114.mostWordsFound(sentences));
    }
}
