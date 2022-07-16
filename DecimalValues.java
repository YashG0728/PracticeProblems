import java.util.Scanner;

public class SmallLargeNumber {

	public static void main(String[] args) {
		
	double input;
	Scanner S = new Scanner(System.in);
	System.out.println("input value : ");
	input = S.nextDouble();
	
	if (input > 0)
	{
	if (input < 1) {
	System.out.println("Positive Small Number");
	}
	else if(input > 1000000) {
		System.out.println("Positive large number");
	}
	else {
             System.out.println("Positive number");
         }	
	}
	else if (input < 0)
    {
        if (Math.abs(input) < 1)
        {
            System.out.println("Negative small number");
        }
        else if (Math.abs(input) > 1000000)
        {
            System.out.println("Negative large number");
        }
        else
        {
            System.out.println("Negative number");
        }
    }
    else
    {
        System.out.println("Zero");
	
		}
	  }
	}
