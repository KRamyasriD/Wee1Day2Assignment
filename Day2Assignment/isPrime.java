package Day2Assignment;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Goal: To understand the problem solving, looping and conditional statement
		 * 
		 * a) Create a class by name: IsPrime b) Create a main method using shortcut c)
		 * Write a logic to find if the given number is prime or not d) Print if it is
		 * prime or not
		 * 
		 * Hint: Iterate through all numbers from 2 to n-1 (input) and for every number
		 * check if it divides n (input). If we find any number that divides(1 or same
		 * number), print prime. If nothing divides, then print non-prime.
		 */
		
		int number = 6767; 
        
		int a =0; 
		
		if (number <=1) {
			System.out.println("Number is not Prime Number");
			return;
			
	
		}
		
		for (int i=1; i<= number/2; i++) {
			if (number% i == 0) {
				a ++ ;
				
				
			}
		}
		
		if (a >1) {
			System.out.println("Number is not Prime Number");
	
		}
		
		else System.out.println("Number is  Prime Number");
		
		
		
		
		
		

	}

}
