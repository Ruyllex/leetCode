import org.junit.Test;
/*
Remove Trailing Zeros From a String

Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
*/

public class $2710  {
    public static String removeTrailingZeros(String num) {
        int count = 0;
        if(num.charAt(num.length() - 1) != '0'){
            return num;
        }
        for(int i = num.length() - 1; i != 0; i--){
            if(num.charAt(i) == '0'){
                count++;
                } 
            else{
                break;
            }
            }
            return num.substring(0, num.length() - count);
        }
    @Test
    public void testRemoveTrailingZeros(){
        String num = "51230100";
        String ans = "512301";
        assert removeTrailingZeros(num).equals(ans);
    }
    @Test
    public void testRemoveTrailingZeros2(){
        String num = "123";
        String ans = "123";
        assert removeTrailingZeros(num).equals(ans);
    }
}
