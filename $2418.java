import org.junit.Test;
import java.util.Arrays;
/*
Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers. 
Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.
*/

public class $2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int max = 0;
        int indexMax = 0;
        int count = 0;
        for(int i = 0; i != heights.length; i++){
            if(max < heights[i]){
                max = heights[i];
                indexMax = i;
            }
            if(i == heights.length - 1){
                String aux = names[count];
                int auxN = heights[count];
                heights[count] = heights[indexMax];
                heights[indexMax] = auxN;
                names[count] = names[indexMax];
                names[indexMax] = aux;
                i = count;
                count++;
                indexMax = 0;
                max = 0;
            }
        }
        return names;
    }
    @Test
    public void testSortPeople() {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] ans = {"Mary","Emma","John"};
        assert Arrays.equals(ans,sortPeople(names, heights));
    }
    @Test
    public void testSortPeople2() {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        String[] ans = {"Bob","Alice","Bob"};
        assert Arrays.equals(ans,sortPeople(names, heights));
    }
    @Test
    public void testSortPeople3() {
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        String[] ans = {"EPCFFt","RPJOFYZUBFSIYp","VOYGWWNCf","Vk","Sgizfdfrims","IEO","QTASHKQ","WSpmqvb"};
        sortPeople(names, heights);
        assert Arrays.equals(ans,sortPeople(names, heights));
    }
    public static void main(String[] args){
            org.junit.runner.JUnitCore.main("$2418");
        }
}