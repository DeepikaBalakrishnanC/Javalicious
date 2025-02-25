import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String arg[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two numbers to swap :");
		
		int Num1 = s.nextInt();
		int Num2 = s.nextInt();
		
		System.out.println("The numbers Before Swapping :"+ Num1 +" "+ Num2);
		
		int temp = Num1;
		Num1 =  Num2;
		Num2 = temp;
		
		System.out.println("After Swapping Numbers are "+ Num1 +" "+ Num2);
	
	}

}
