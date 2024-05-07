import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/*
Sum of Values at Indices With K Set Bits

You are given a 0-indexed integer array nums and an integer k.
Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.
The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.
*/

public class $2859  {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i = 0; i != nums.size();i++){
            if(coutUne(Integer.toBinaryString(i)) == k){
                ans += nums.get(i);
            }
        }
        return ans;
    }
    public static int coutUne(String cadenaBits) {
        int contador = 0;
        for (int i = 0; i < cadenaBits.length(); i++) {
            if (cadenaBits.charAt(i) == '1') {
                contador++;
            }
        }
        return contador;
    }
    @Test
    public void testSumIndicesWithSetBits(){
        List<Integer> nums = new ArrayList<>(List.of(5,10,1,5,2));
        int k = 1;
        int ans = 13;
        assertEquals(ans, $2859.sumIndicesWithKSetBits(nums,k));
    }  
    @Test
    public void testSumIndicesWithSetBits2(){
        List<Integer> nums = new ArrayList<>(List.of(4,3,2,1));
        int k = 2;
        int ans = 1;
        assertEquals(ans, $2859.sumIndicesWithKSetBits(nums,k));
    }      
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$2859");
    }
}
