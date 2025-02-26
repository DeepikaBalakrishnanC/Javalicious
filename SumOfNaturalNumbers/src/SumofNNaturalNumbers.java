import java.util.Scanner;

public class SumofNNaturalNumbers {
	
	public static void main(String arg[]) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		
		int limit = S.nextInt();
		int sum = 0;
		
		for(int i=1;i<=limit;i++) {
			sum = sum + i;	
		}
		System.out.println("Sum is : "+sum);
		}

}
