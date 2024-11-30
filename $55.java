import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class $55 {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; 
            }
        }
        return false;
    }
    @Test
    public void testcanJump(){
        int[] nums = {2,3,1,1,4};
        assertTrue($55.canJump(nums));
    }
    @Test
    public void testcanJump2(){
        int[] nums = {3,2,1,0,4};
        assertFalse($55.canJump(nums));
    }
    @Test
    public void testcanJump3(){
        int[] nums = {0};
        assertTrue($55.canJump(nums));
    }
    @Test
    public void testcanJump4(){
        int[] nums = {0,1};
        assertFalse($55.canJump(nums));
    }
    @Test
    public void testcanJump5(){
        int[] nums = {2,0,0};
        assertTrue($55.canJump(nums));
    }
}
