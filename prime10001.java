
public class prime10001
 {
    public static boolean Prime(long n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i=2;i<=Math.sqrt(n);i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }
 public static void main(String args[]) {
     int k=0;
     for(int i=2;;i++) {
         if(Prime(i)==true)
         {
             k++;					
             }
         if(k==10001) {
             System.out.println("The 10001st prime number is "+i);
             break;
         }
}
 }
}