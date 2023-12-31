package hackerrank;

public class Sorting {
	
	
	public static void main(String[] args) {
		
		
		int[] x = {1,45,22,11,101,66};
		
		for(int i=0;i<x.length;i++) {
			
			
			for(int j = i+1;j<x.length;j++) {
				
				if(x[i]>x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
					
					
				}
				
			}
		}
		
		
		for(int i=0;i<x.length;i++) {
			
			System.out.println(x[i]);
		}
		
	}
	
	
	

}
