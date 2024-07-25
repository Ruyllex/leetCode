import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
Determine Color of a Chessboard Square

You are given coordinates, a string that represents the coordinates of a square of the chessboard. 
Below is a chessboard for your reference.
Return true if the square is white, and false if the square is black.
The coordinate will always represent a valid chessboard square. 
The coordinate will always have the letter first, and the number second.
*/

public class $1812{
    public static boolean check(char s){
        String aux = "dbfh";
        for(int i = 0; i != aux.length();i++){
            if(s == aux.charAt(i)){
                return true;
                }
        }
        return false;
    }
    public static boolean squareIsWhite(String coordinates) {
        if(check(coordinates.charAt(0))){
            if((int)coordinates.charAt(1) % 2 == 0){
                return false;
            }
            else{
                return true;
            }
            }
            else{
                if((int)coordinates.charAt(1) % 2 == 0){
                    return true;
                    }
                else{
                    return false;
                }
            }
        }
    @Test
    public void testSquareIsWhite(){
        assertFalse($1812.squareIsWhite("a1"));
    }
    @Test
    public void testSquareIsWhite2(){
        assertTrue($1812.squareIsWhite("h3"));
    }
    @Test
    public void testSquareIsWhite3(){
        assertFalse($1812.squareIsWhite("c7"));
    }
}
