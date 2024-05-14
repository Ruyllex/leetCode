import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
Divisor Game

Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.
Return true if and only if Alice wins the game, assuming both players play optimally.
*/

public class $1025 {
    public static int Check(int n){
        if(n == 0){
            return 0;
        }
        for(int j = 1; j != n; j++){
            if(n % j == 0){
                return j;
            }
        }
        return 0;
    }
    public static boolean divisorGame(int n) {
        int ans = 0;
        while(Check(n) != 0){
            n = n - Check(n);
            ans++;
        }
        if(ans % 2 == 0){
            return false;
        }
        return true;
    }
    @Test
    public void testDivisorGame(){
        int n = 2;
        assertTrue($1025.divisorGame(n));
    }
    @Test
    public void testDivisorGame2(){
        int n = 3;
        assertFalse($1025.divisorGame(n));
    }

}
