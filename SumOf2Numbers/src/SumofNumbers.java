import java.util.Scanner;

public class SumofNumbers {
	
	public static void main(String ar[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int result = num1 + num2 ;
		
		System.out.println("Sum is " + result);
		
	}

}
