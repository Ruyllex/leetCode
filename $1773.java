import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class $1773  {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int ind;
        if(ruleKey.equals("type")){
            ind = 0;
        }else if(ruleKey.equals("color")){
            ind = 1;
        }else{
            ind = 2;
        }
        for(int i = 0; i != items.size();i++){
            if(items.get(i).get(ind).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
    @Test
    public void testCountMatches(){
        List<String> aux = List.of("phone","blue","pixel");
        List<String> aux2 = List.of("computer","silver","lenovo");
        List<String> aux3 = List.of("phone","gold","iphone");
        List<List<String>> items = List.of(aux,aux2,aux3);
        String ruleKey = "color";
        String ruleValue = "silver";
        int ans = 1;
        assertEquals(ans, $1773.countMatches(items,ruleKey,ruleValue));
    }
    @Test
    public void testCountMatches2(){
        List<String> aux = List.of("phone","blue","pixel");
        List<String> aux2 = List.of("computer","silver","phone");
        List<String> aux3 = List.of("phone","gold","iphone");
        List<List<String>> items = List.of(aux,aux2,aux3);
        String ruleKey = "type" ;
        String ruleValue = "phone";
        int ans = 2;
        assertEquals(ans, $1773.countMatches(items,ruleKey,ruleValue));
    }
}
