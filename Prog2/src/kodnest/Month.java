package kodnest;
import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter the month ");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		
		switch (month) {
		case "March":
		case "April":
		case "May":
			System.out.println("its first quater");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("its second quater");
			break;
		case "September":
		case "October":
		case "November":
			System.out.println("it's third quater");
			break;
		case "December":
		case "January":
		case "Febrary":
			System.out.println("it's fourth quater");
			break;
		default:
			System.out.println("invalid input ");
		}

	}

}
