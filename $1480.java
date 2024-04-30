import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class $1480 {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i != nums.length; i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
    @Test
    public void testRunningSum(){
        int[] nums = {1,2,3,4};
        int[] ans = {1,3,6,10};
        assertArrayEquals($1480.runningSum(nums), ans);
    }
    @Test
    public void testRunningSum2(){
        int[] nums = {1,1,1,1,1};
        int[] ans = {1,2,3,4,5};
        assertArrayEquals($1480.runningSum(nums), ans);
    }
    @Test
    public void testRunningSum3(){
        int[] nums = {3,1,2,10,1};
        int[] ans = {3,4,6,16,17};
        assertArrayEquals($1480.runningSum(nums), ans);
    }
    
}
