package kodnest;
import java.util.Scanner;


public class KmToMileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the num");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		KmToMiles k1 = new KmToMiles();
		k1.calKmToMile(num1);
		
		
		

	}

}
