import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Final Value of Variable After Performing Operations

There is a programming language with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.

Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
*/

public class $2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i != operations.length; i++) {
            if (operations[i] == "X--" || operations[i] == "--X") {
                ans--;
            } else
                ans++;
        }
        return ans;
    }

    @Test
    public void testFinalValueAfterOperations() {
        String[] operations = { "--X", "X++", "X++" };
        int ans = 1;
        assertEquals(ans, $2011.finalValueAfterOperations(operations));
    }

    @Test
    public void testFinalValueAfterOperations2() {
        String[] operations = { "++X", "++X", "X++" };
        int ans = 3;
        assertEquals(ans, $2011.finalValueAfterOperations(operations));
    }

    @Test
    public void testFinalValueAfterOperations3() {
        String[] operations = { "X++", "++X", "--X", "X--" };
        int ans = 0;
        assertEquals(ans, $2011.finalValueAfterOperations(operations));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$2011");
    }
}
