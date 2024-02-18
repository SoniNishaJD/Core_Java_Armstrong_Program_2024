
public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum = 0,a,temp;
		int num = 135;
		temp = num;
		
	while(num >0) {
		 a=num%10;
		 num=num/10;   
	        sum=sum+(a*a*a); 
	}
	   if(temp==sum)    
	        System.out.println(temp+" is an armstrong number");     
	    else    
	        System.out.println(temp+ "is not an armstrong number");     
	   }    
	}  
