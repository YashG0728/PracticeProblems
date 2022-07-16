import java.util.Scanner;

public class NumOfDays {

	public static void main(String[] args) {
		
		Scanner N = new Scanner(System.in);
		
		System.out.println("Enter Month: ");
		int Month = N.nextInt();
		
		System.out.println("Enter Year: ");
		int Year = N.nextInt();
		String MonthOfName = "Unknown";
		int NumOfDaysInMonth = 0;
		
		switch (Month) {
		case 1: MonthOfName = "January";
		NumOfDaysInMonth = 31;
		break;
		
		case 2: MonthOfName = "February";
		if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0))) {
			NumOfDaysInMonth = 29;
		} else {
			NumOfDaysInMonth = 28;
		}
		break;
		
		case 3: MonthOfName = "March";
		NumOfDaysInMonth = 31;
		break;
		
		case 4: MonthOfName = "April";
		NumOfDaysInMonth = 30;
		break;
		
		case 5: MonthOfName = "May";
		NumOfDaysInMonth = 31;
		break;
		
		case 6: MonthOfName = "June";
		NumOfDaysInMonth = 30;
		break;
		
		case 7: MonthOfName = "July";
		NumOfDaysInMonth = 31;
		break;
		
		case 8: MonthOfName = "August";
		NumOfDaysInMonth = 31;
		break;
		
		case 9: MonthOfName = "September";
		NumOfDaysInMonth = 30;
		break;
		
		case 10: MonthOfName = "Octomber";
		NumOfDaysInMonth = 31;
		break;
		
		case 11: MonthOfName = "November";
		NumOfDaysInMonth = 30;
		break;
		
		case 12: MonthOfName = "December";
		NumOfDaysInMonth = 31;
		break;
		
		}
		
		System.out.print(MonthOfName + " " + Year + " has " + NumOfDaysInMonth + " days");

	}

}
