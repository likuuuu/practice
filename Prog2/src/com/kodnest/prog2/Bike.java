package com.kodnest.prog2;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeAtt b1 = new BikeAtt();
		b1.engNo="BKB200";
		b1.brandName="honda";
		b1.color="Red";
		b1.dispData();
		b1.start();
		b1.stop();
		System.out.println("---------------------------------------");
		
		
		BikeAtt b2=new BikeAtt();
		b2.engNo="BNB500";
		b2.brandName="Ktm";
		b2.color="white";
		b2.start();
		b2.stop();
		b2.move();
		b2.dispData();
		System.out.println("---------------------------------------");
		
		BikeAtt b3 = new BikeAtt();
		b3.engNo="ABL44";
		b3.brandName="Hayabuza";
		b3.color="Deepblack";
		b3.move();
		b3.start();
		b3.dispData();
		
		

	}

}
