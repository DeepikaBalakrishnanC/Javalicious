package Sample;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String arg[]) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the principle amount : ");
		float P = S.nextFloat();
		System.out.println("Enter the time : ");
		int T = S.nextInt();
		System.out.println("Enter the rate : ");
		float R = S.nextFloat();
		
		float Simple_Interest = (P * T * R) / 100 ;
		
		System.out.println("Simple interest : "+ Simple_Interest);
	}

}
