package Sections1Thru8;

public class Car {

	/*
	 * Primitive Data types for class Car
	 * */
	double odometer=192456.265;//,mph,tankCap,currGas,accelerationSpeed,year,month;
	String make="Sonata",model="Hyundai";
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
