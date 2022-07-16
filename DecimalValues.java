import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		double a, b, c;
		System.out.println("input value of a : ");
		a = S.nextDouble();
		System.out.println("input value of b : ");
		b = S.nextDouble();
		System.out.println("input value of c : ");
		c = S.nextDouble();
		
		double formula = b * b - 4.0 * a *c;
		
		if (formula > 0.0){
		double R1 = (-b + Math.pow(formula, 0.5))/(2.0 * a);
		double R2 = (-b + Math.pow(formula, 0.5))/(2.0 * a);
			System.out.println("The roots are " + R1 + " and " + R2);
		  } 
		
		else if (formula == 0.0) {
              double R1 = -b / (2.0 * a);
              System.out.println("The root is " + R1);
          }
		
		else {
              System.out.println("The equation has no real roots.");
          }

		}
	}
