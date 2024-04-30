import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 Goal Parser Interpretation

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.
*/
public class $1678{
    public static String interpret(String command) {
        String ans = "";
        for(int i = 0; i != command.length(); i++){
            if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    ans += "o";
                }
                else{
                    ans += "al";
                }
            }
            if(command.charAt(i) == 'G'){
                ans += "G";
            }
        }
        return ans;
    }    
    @Test
    public void testIterpret1(){
        String command = "G()(al)";
        String ans = "Goal";
        assert ans.equals($1678.interpret(command));
    }
    @Test
    public void testIterpret2(){
        String command = "G()()()()(al)";
        String ans = "Gooooal";
        assert ans.equals($1678.interpret(command));
    }
    @Test
    public void testIterpret3(){
        String command = "(al)G(al)()()G";
        String ans = "alGalooG";
        assert ans.equals($1678.interpret(command));
    }
}
