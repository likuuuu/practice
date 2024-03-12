package kodnest;

import java.util.Scanner;

public class PercentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the percent ");
		double per = scan.nextDouble();
		Percent p1 = new Percent();
		p1.calPercent(per);
		

	}

}
