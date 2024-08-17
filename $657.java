import org.junit.Test;
import static org.junit.Assert.*;
/*
Robot Return to Origin

There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, 
judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. 
Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. 
Also, assume that the magnitude of the robot's movement is the same for each move.
*/

public class $657 {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char move: moves.toCharArray()){
            if(move == 'U'){
                y++;
            }else if(move == 'R'){
                x++;
            }else if(move == 'L'){
                x--;
            }else{
                y--;
            }
        }
        return (x == 0 && y == 0);
    }   
    @Test
    public void testJudgeCircle(){
        String moves = "UD";
        assertTrue($657.judgeCircle(moves));
    }
    @Test
    public void testJudgeCircle2(){
        String moves = "LL";
        assertFalse($657.judgeCircle(moves));
    }

}