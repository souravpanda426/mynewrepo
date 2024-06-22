package Stepdefinitions;




public class MySecClass {
	
	
	
	public static void main(String[] args) {
		
		int sum = 12;
		
		int[] x = {3,4,5,6,8,9,7};
		
		int currentsum=0;
		
		for(int i =0;i<x.length;i++) {
			
			currentsum=x[i];
			
			if(sum==currentsum) {
				
				System.out.println(i);
			}
			
			
			for(int j=i+1;j<x.length;j++) {
				
				currentsum= currentsum + x[j];
				
				
				if(currentsum==sum) {
					
					System.out.print(i + "&" + j);
					
				}
				
				
			}
			
			
			
		}
		
	
	
		
	
	
	}

}
