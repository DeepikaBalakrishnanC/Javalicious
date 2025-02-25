package factorial;

import java.util.Scanner;

public class Sample {

	public static void main(String ar[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = s.nextInt();
		long fact = 1;
		if(num<0) {
			System.out.println("Error: Factorial is not defined for negative numbers.");
		}
		else {
			for (int i = 1; i<= num ; i++) {
			fact = fact * i;
			}
		
		System.out.println("Factorial of "+num+" is "+fact);
		}
	}
	
}
