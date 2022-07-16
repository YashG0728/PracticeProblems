import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		int a , b, c;
		Scanner S = new Scanner(System.in);
		System.out.println("Input a : ");
		a = S.nextInt();
		System.out.println("Input b : ");
		b = S.nextInt();
		System.out.println("Input c : ");
		c = S.nextInt();

		if (a > b)
		if (a > c) {
			System.out.println("A is greater ");
		}	 
		if (b > c)
		if (b > a) {
			System.out.println("B is greater");
		}
		if (c > a) 
		if (c > b) {
	    	System.out.println("C is greater");
		}
	}
}
