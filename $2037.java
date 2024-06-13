import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
/*
Minimum Number of Moves to Seat Everyone

There are n seats and n students in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat.
You are also given the array students of length n, where students[j] is the position of the jth student.
You may perform the following move any number of times:

    Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)

Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
Note that there may be multiple seats or students in the same position at the beginning.
*/
public class $2037{
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        int seatsLarge = seats.length;
        for(int i = 0;i != seatsLarge;i++){
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
    @Test
    public void testMinMOvewToSeat(){
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int ans = 4;
        assertEquals(ans, $2037.minMovesToSeat(seats,students));        
    }
    @Test
    public void testMinMOvewToSeat2(){
        int[] seats = {4,1,5,9};
        int[] students = {1,3,2,6};
        int ans = 7;
        assertEquals(ans, $2037.minMovesToSeat(seats,students));        
    }
    @Test
    public void testMinMOvewToSeat3(){
        int[] seats = {2,2,6,6};
        int[] students = {1,3,2,6};
        int ans = 4;
        assertEquals(ans, $2037.minMovesToSeat(seats,students));        
    }

}