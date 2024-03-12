package com.kn.decreforloop;
import java.util.Scanner;

public class decreFor {

	public static void main(String[] args) {
		System.out.println("enter the num ");
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for (int i=1;i<=num;i++) {
			sum = sum+i;
			
			
		}
		System.out.println("the sum of "+ num +" " +"natural no is "+ sum);
		

	}

}
