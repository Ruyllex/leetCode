import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Crawler Log Folder


The Leetcode file system keeps a log each time some user performs a change folder operation.

The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
The file system starts in the main folder, then the operations in logs are performed.
Return the minimum number of operations needed to go back to the main folder after the change folder operations.
*/


public class $1598{
    public static int minOperations(String[] logs) {
        int ans = 0;
        String back = "../";
        for(String x : logs){
            if(x.equals(back)){
                ans --;
                if(ans < 0) ans = 0;
                }else if(!x.equals("./")){
                    ans ++;
                    }
        }
        return ans;
    }
    @Test
    public void testMinOperations() {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int ans = 2;
        assertEquals(ans, $1598.minOperations(logs));
    }
}
