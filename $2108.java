import org.junit.Test;

/*
Find First Palindromic String in the Array

Given an array of strings words, return the first palindromic string in the array. 
If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.
*/


public class $2108 {
    public static boolean palindromic (String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static String firstPalindrome(String[] words) {
        for (int j = 0; j < words.length; j++) {
            if (palindromic(words[j])) {
                return words[j];
            }
        }
        return "";
    }
    @Test
    public void testFirstPalindrome(){
        String[] words = {"abc","car","ada","racecar","cool"};
        String ans = "ada";
        ans.equals($2108.firstPalindrome(words));
    }
    @Test
    public void testFirstPalindrome2(){
        String[] words = {"notapalindrome","racecar"};
        String ans = "racecar";
        ans.equals($2108.firstPalindrome(words));
    }
    @Test
    public void testFirstPalindrome3(){
        String[] words = {"def","ghi"};
        String ans = "";
        ans.equals($2108.firstPalindrome(words));
    }
}
