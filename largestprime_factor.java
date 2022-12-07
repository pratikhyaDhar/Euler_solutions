import java.io.*;
import java.util.*;
public class largestprime_factor{
   static long maxPrime( long v){
      long max_prime = -1;
      while (v % 2 == 0) {
         max_prime = 2;
         v>>= 1;
      }
      for (int i = 3; i <= Math.sqrt(v); i += 2){
         while (v % i == 0){
            max_prime = i;
            v = v / i;
         }
      }
      if (v > 2)
      max_prime = v;
      return max_prime;
   }
   public static void main(String[] args){
      long v =  600851475143L;
      System.out.println("The largest prime factor of  600851475143 is "+maxPrime(v));
    
     
   }
}