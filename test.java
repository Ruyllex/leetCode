public class test {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
    }
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
}

