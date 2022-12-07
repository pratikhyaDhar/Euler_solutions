

public class even_fibonacci
 {
    public static void main(String args[]) {
    int a=0,b=1,c,s=0;    		    
		 for(int i=2;i<1000000;i++)   
		 {    
		  c=a+b;    
		  if(c%2==0) {
			  s+=c;
		  }
		  a=b;    
		  b=c;    
		 }
		 System.out.println("The sum of the even fibonacci nos is ="+s);
}
 }