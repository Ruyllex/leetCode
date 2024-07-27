public class test {
    public static void main(String[] args) {
        System.out.println(shift("a5"));
    }
    public static char shift(String s){
        String dic = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i != dic.length();i++){
            if(dic.charAt(i) == (s.charAt(0))){

             return dic.charAt(i + Integer.parseInt(s.substring(1))); 
            }
        }
        return 'a';
    }
}

