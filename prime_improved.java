

public class prime_improved 
{
    public static void main(String[] args) 
    {
        
        int counter = 0;
        int primeNum = 0;

        for (int num = 2; counter < 100001; num++) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(num);
            for (int factor = 2; factor <= limit; factor++) {

                if (num % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum = num;
                counter++;
            }
            if (counter == 10001) {
                break;
            }
        }
        System.out.println(primeNum);
}
}