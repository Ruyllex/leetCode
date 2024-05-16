import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Convert the Temperature

You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.
*/

public class $2469{
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32;
        return ans; 
    }
    @Test
    public void testConvertTemperature(){
        double celsius = 36.50;
        double[] ans = {309.65000,97.70000};
        double delta = 0.0001;
        assertArrayEquals(ans, $2469.convertTemperature(celsius),delta);
    }
    @Test
    public void testConvertTemperature2(){
        double celsius = 122.11;
        double[] ans = {395.26000,251.79800};
        double delta = 0.0001;
        assertArrayEquals(ans, $2469.convertTemperature(celsius),delta);
    }
}
