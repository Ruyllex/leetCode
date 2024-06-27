import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Find Center of Star Graph

There is an undirected star graph consisting of n nodes labeled from 1 to n. 
A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.
You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. 
Return the center of the given star graph.
*/


public class $1791  {
    public static int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0]){
            return edges[0][0];
        }
        if(edges[0][1] == edges[1][0]){
            return edges[0][1];
        }
        if(edges[0][0] == edges[1][1]){
            return edges[0][0];
        }        
        if(edges[0][1] == edges[1][1]){
            return edges[0][1];
        }
        return 0;
    }
    @Test
    public void testFindCenter(){
        int[][] edges = {{1,2},{2,3},{4,2}};
        int ans = 2;
        assertEquals(ans, $1791.findCenter(edges));
    }
}
