import java.math.BigInteger;
public class power_digit_sum
 {
	public static void main(String[] args) 
    {
		int result = 0;

String v = BigInteger.valueOf(2).pow(1000).toString();

for(char a : v.toCharArray()){
    result = result + Character.getNumericValue(a);
}
System.out.println("sum of the digits of the number 21000 is " + result);
	}
}


