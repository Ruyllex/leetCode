import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

/*
Maximize Happiness of Selected Children

You are given an array happiness of length n, and a positive integer k.
There are n children standing in a queue, where the ith child has happiness value happiness[i]. 
You want to select k children from these n children in k turns.
In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1. 
Note that the happiness value cannot become negative and gets decremented only if it is positive.
Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.
*/



public class  $3075 {
    public static long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        int large = happiness.length - 1;
        int aux;
        for(int i = 0; i != k;i++){
            if(i == 0){
                ans += happiness[large];
            }
            else{
                aux = happiness[large] - i;
                if(aux <= 0){
                    ans += 0;
                }
                else{
                    ans += aux;
                }
            }
            large--; 
        }
        return ans;
    }   
    @Test    
    public void testMaximunHappinessSum(){
        int[] happiness = {1,2,3};
        int k = 2;
        int ans = 4;
        assertEquals(ans, $3075.maximumHappinessSum(happiness,k));
    }
    @Test    
    public void testMaximunHappinessSum2(){
        int[] happiness = {1,1,1,1};
        int k = 2;
        int ans = 1;
        assertEquals(ans, $3075.maximumHappinessSum(happiness,k));
    }
    @Test    
    public void testMaximunHappinessSum3(){
        int[] happiness = {2,3,4,5};
        int k = 1;
        int ans = 5;
        assertEquals(ans, $3075.maximumHappinessSum(happiness,k));
    }
    @Test    
    public void testMaximunHappinessSum4(){
        int[] happiness = {12,1,42};
        int k = 3;
        int ans = 53;
        assertEquals(ans, $3075.maximumHappinessSum(happiness,k));
    }
}
