package hackerrank;

import java.util.LinkedList;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lm = new LinkedList<Integer>();
		
		LinkedList<Integer> lmtwo = new LinkedList<Integer>();
		
		
		
		for(int i=1;i<=5;i++) {
			
			lm.add(i);
		}
		
		System.out.println(lm);
		
		for(int i =lm.size()-1;i>=0;i--) {
			
			lmtwo.add(lm.get(i));
		}
		
		
		System.out.println(lmtwo);

	}

}
