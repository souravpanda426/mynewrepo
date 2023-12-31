package hackerrank;

public class HighestCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 70;
		
		int b = 15;
		
		
		 int  i, hcf = 0;
		
	
		
		for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	        	 System.out.println(i);
	         hcf = i;
	      }
		
		System.out.println(hcf);

	}
	
}


