import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int day = S.nextInt();
		System.out.println("Day Name");
		
		System.out.println(getDayName(day));
	}

	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1: dayName = "Monday"; 
		break;
		case 2: dayName = "Tuesday"; 
		break;
		case 3: dayName = "Wednesday";
		break;
		case 4: dayName = "Thusday";
		break;
		case 5: dayName = "Friday";
		break;
		case 6: dayName = "Saturday";
		break;
		case 7: dayName = "Sunday"; 
		break;
		default:dayName = "Invalid day range";
		}
		
		return dayName;
		
			}
		}
	


