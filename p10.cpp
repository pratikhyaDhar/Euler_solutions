 #include <stdio.h>
      #include <math.h>
      
       #define sumof 2000000
       
      int isaprime (int num);
      
       int main (void) {
       
         int i;
          long sum = 0;
      
          for (i = 2; i < sumof; i++) {
      
                  if (isaprime(i) == 1) {
                          sum = sum + i;
                 }
          }
          printf("sum: %ld\n", sum);
      
          return 0;
      }
     
      int isaprime (int num) {
      
         int i;
     
         for (i = 2; i <= sqrt(num); i++) {
                 if (num % i == 0) {
                         return 0;
                 }
    else {
                         ;
                  }
         }
      
          return 1;
      }