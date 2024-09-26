import static org.junit.Assert.assertTrue;
import org.junit.Test;
/*
Excel Sheet Column Title

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3

Z -> 26
AA -> 27
AB -> 28 
*/

public class $168 {
    public static String convertToTitle(int columnNumber){
        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            str.insert(0, (char)('A' + index));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.toString();
    }
    @Test
    public void testConvertToTitle(){
        int columnNumber = 1;
        String ans = "A";
        assertTrue(ans.equals($168.convertToTitle(columnNumber)));
    }
    @Test
    public void testConvertToTitle2(){
        int columnNumber = 28;
        String ans = "AB";
        assertTrue(ans.equals($168.convertToTitle(columnNumber)));
    }
    @Test
    public void testConvertToTitle3(){
        int columnNumber = 701;
        String ans = "ZY";
        assertTrue(ans.equals($168.convertToTitle(columnNumber)));
    }
}
