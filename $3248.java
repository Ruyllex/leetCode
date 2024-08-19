import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;
/*
Snake in Matrix

There is a snake in an n x n matrix grid and can move in four possible directions. 
Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.

The snake starts at cell 0 and follows a sequence of commands.

You are given an integer n representing the size of the grid and an array of strings commands where each 
command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within the grid boundaries 
throughout its movement.

Return the position of the final cell where the snake ends up after executing commands.
*/

public class $3248 {
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;
        for (String command : commands) {
            if (command.equals("UP")) {
                if (x > 0) {
                    x--;
                    }
                } else if (command.equals("RIGHT")) {
                    if (y < n - 1) {
                        y++;
                        }
                } else if (command.equals("DOWN")) {
                    if (x < n - 1) {
                        x++;
                        }
                } else if (command.equals("LEFT")) {
                    if (y > 0) {
                        y--;
                         }
                    }
            }
            return (x * n) + y;           
    }
    @Test
    public void testFinalPositionOfSnake(){
        int n = 2;
        List<String> commands = List.of("RIGHT","DOWN");
        int ans = 3;
        assertEquals(ans, $3248.finalPositionOfSnake(n, commands));
    }
}