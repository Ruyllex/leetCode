import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Partitioning Into Minimum Number Of Deci-Binary Numbers

A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. 
For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
*/

public class $1689 {
    public static int minPartitions(String n) {
        int ans = 0;
        for(int i = 0; i != n.length(); i++){
            int aux = n.charAt(i) - '0';
            if(aux > ans){
                ans = aux;
            }
        }
        return ans;
    }
    @Test
    public void testMinPatitios(){
        String n = "32";
        int ans = 3;
        assertEquals(ans, $1689.minPartitions(n));
    }
    @Test
    public void testMinPatitios2(){
        String n = "82734";
        int ans = 8;
        assertEquals(ans, $1689.minPartitions(n));
    }
    @Test
    public void testMinPatitios3(){
        String n = "27346209830709182346";
        int ans = 9;
        assertEquals(ans, $1689.minPartitions(n));
    }
}
