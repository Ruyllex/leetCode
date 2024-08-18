import static org.junit.Assert.assertTrue;
import org.junit.Test;
/*
Encode and Decode TinyURL

    Note: This is a companion problem to the System Design problem: Design TinyURL.

TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl 
and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded 
to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Solution class:

    Solution() Initializes the object of the system.
    String encode(String longUrl) Returns a tiny URL for the given longUrl.
    String decode(String shortUrl) Returns the original long URL for the given shortUrl. 
    It is guaranteed that the given shortUrl was encoded by the same object.

*/

public class $535 {
    public class Codec {

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String ans = "";
            int indexStart = 0;
            boolean first = false;
            for(int i = 0; i != longUrl.length();i++){
                if(longUrl.charAt(i) == '/' && longUrl.charAt(i - 1) == 'm' && first == true){
                    first = true;
                    indexStart = i + 1;
                    ans = ans + longUrl.substring(0, indexStart);
                }
            }
            for(int j = indexStart; j != longUrl.length(); j++){
                ans = ans + (char)(longUrl.charAt(j) - 3);
            }
            return ans;
        }
    
        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            String ans = "";
            int indexStart = 0;
            for(int i = 0; i != shortUrl.length();i++){
                if(shortUrl.charAt(i) == '/' && shortUrl.charAt(i - 1) == 'm'){
                    indexStart = i + 1;
                    ans = ans + shortUrl.substring(0, indexStart);
                }
            }
            for(int j = indexStart; j != shortUrl.length(); j++){
                ans = ans + (char)(shortUrl.charAt(j) + 3);
            }
            return ans;
        }
    }
    
    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.decode(codec.encode(url));
    @Test
    public void testTinyURL(){
        String url = "https://leetcode.com/problems/design-tinyurl";
        String ans = "https://leetcode.com/problems/design-tinyurl";
        Codec obj = new Codec();
        String tiny = obj.encode(url);
        assertTrue(ans.equals(obj.decode(tiny)));
    }
    @Test
    public void testTinyURL2(){
        String url = "https://example.com/alarm/beds.html?alarm=baseball&basketball=bat";
        String ans = "https://example.com/alarm/beds.html?alarm=baseball&basketball=bat";
        Codec obj = new Codec();
        String tiny = obj.encode(url);
        assertTrue(ans.equals(obj.decode(tiny)));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$535");
    }
}
