import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;



/*
Richest Customer Wealth


You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth.
 */



public class $1672 {
    public static int sum(int[] list){
        int ans = 0;
        for(int j = 0; j != list.length;j++){
            ans = ans + list[j];
        }
        return ans;
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i != accounts.length; i++){
            int aux = sum(accounts[i]);
            if( ans < aux ){
                ans = aux;
            }
        }
        return ans;
    }
    @Test
    public void testMaximunWealth1(){
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = 6;
        assertEquals(ans, $1672.maximumWealth(accounts));
    }
    @Test
    public void testMaximunWealth2(){
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans = 10;
        assertEquals(ans, $1672.maximumWealth(accounts));
    }
    @Test
    public void testMaximunWealth3(){
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int ans = 17;
        assertEquals(ans, $1672.maximumWealth(accounts));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$1672");
    }
}
