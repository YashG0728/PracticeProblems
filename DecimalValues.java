import java.util.Scanner;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		int Number;
		Scanner s = new Scanner(System.in);
		System.out.println("Input Any Number : ");
		Number = s.nextInt();
		
		if (Number > 0) {
			System.out.println("Positive Number");
		}
		else  if(Number < 0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("zero");
		}
		
	}

}
