package Day2Assignment;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hints:
		 * 
		 * Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0) Print
		 * first number Iterate from 1 to the 11 Add first and second number assign to
		 * sum Assign second number to the first number Assign sum to the second number
		 * Print sum
		 */
		int firstNum = 0;
		
		int secNum =1;
		
		int sum = 0;
		
		System.out.println("Fibonacci from 0 to 56 :");
		
		for(int f =1;  f < 11; f++ ) {
			
			sum = firstNum+secNum;
			
			firstNum = secNum ;
			
			secNum = sum;
			
		System.out.println(sum);
			
			
		}
		
		
	}

}
