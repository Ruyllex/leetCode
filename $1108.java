import org.junit.Test;

/*
Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
*/
public class $1108{
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    @Test
    public void testdefangIpPaddr(){
        String address = "1.1.1.1"; 
        String ans = "1[.]1[.]1[.]1";
        assert ans.equals($1108.defangIPaddr(address));
    }
    @Test
    public void testdefangIpPaddr1(){
        String address = "255.100.50.0";
        String ans = "255[.]100[.]50[.]0";
        assert ans.equals($1108.defangIPaddr(address));
    }
}
