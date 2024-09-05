import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
/*
Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
    An integer x.
        Record a new score of x.
    '+'.
        Record a new score that is the sum of the previous two scores.
    'D'.
        Record a new score that is the double of the previous score.
    'C'.
        Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
*/

public class $682 {
    public static int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<Integer>();
        for(int i = 0; i != operations.length; i++){
            char c = operations[i].charAt(0);
            if (c < '0' || c > '9') {
                if(c == '+'){
                    int aux = scores.get(scores.size() - 2) + scores.get(scores.size() - 1); 
                    scores.add(aux);
                }
                if(c == 'D'){
                    int aux = scores.get(scores.size() - 1) * 2;
                    scores.add(aux);
                }
                if(c == 'C'){
                    scores.remove(scores.size() - 1);
                    }
                if(c == '-'){
                    int number = Integer.parseInt(operations[i]);
                    scores.add(number);
                }
                }
                else{
                    scores.add(Integer.parseInt(operations[i]));
                }
            }
            int ans = 0;
            for(int i = 0; i != scores.size(); i++){
                ans += scores.get(i);
                }
        return ans;
    }
    @Test
    public void testCalPoints() {
        String[] ops = {"5","2","C","D","+"};
        int ans = 30;
        assertEquals(ans, $682.calPoints(ops));
    }
    @Test
    public void testCalPoints2() {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int ans = 27;
        assertEquals(ans, $682.calPoints(ops));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$682");
    }
}