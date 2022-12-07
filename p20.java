import java.math.BigInteger;
import java.util.*;
public class p20 {

	public static void main(String[] args) {
	
		//Fcatorial Digit Sum
	
		int n=100;
		System.out.println("the sum is "+getfactSum(n));
	}
	 private static long getfactSum(int n) 
	 {
	        BigInteger factorial = BigInteger.ONE;
	        for (int i = 2; i <= n; i++) 
	        {
	        	factorial = factorial.multiply(BigInteger.valueOf(i));
	        }
	        long res = 0;
	        while (factorial.compareTo(BigInteger.ZERO) > 0) 
	        {
	            res += factorial.mod(BigInteger.TEN).longValue();
	            factorial = factorial.divide(BigInteger.TEN);
	        }
	        return res;
	    }
}


