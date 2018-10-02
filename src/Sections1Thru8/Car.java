package Sections1Thru8;

class Car {

	/*
	 * Primitive Data types for class Car
	 * */
	//public int odometer=192456;
	private int odometer=192456;//,mph,tankCap,currGas,accelerationSpeed,year,month;
	private String make="Sonata",model="Hyundai";
	
	public Car (String newMake) {
		make = newMake;
	}
	
	public Car (String newMake, String newModel, int newOdometer) {
		make = newMake;
		model = newModel;
		odometer = newOdometer;
	}
	
	public static void main(String[] args) {
		
		//Constructing two car objects
		Car c1 = new Car("Hyundai","Sonata", 81468415);
		Car c2 = new Car("Hyundai");
		
		c1.toString();
		
		c2.toString();
		
		//Car c2 = new Car();
		
		System.out.println(c1.toString());
		//System.out.println(c2.toString());
		
		//Below, the object c1 that constructs a Car object
		//is calling the printAddress method which returns
		//the reference to c1 through 'this' as a string.
		c1.printAddress();
		
		c1.printAddressPriv();
		
		System.out.println(c1.odometer);
		System.out.println(c1.make + "," + c1.model);
		
		System.out.println("Make: " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Miles(Odometer): " + c1.getOdometer());
		
		/*Can also be written as...*/
		
		System.out.println("**************\n"
				+ "Using the overloaded toString method\n*************\n" + c1.toString());
		
		/*Using the overloaded toString method*/
		
	}
	
	//Basic method that returns 'this' as a String object
	public void printAddress() {
		System.out.println(this.toString());
	}
	
	//This is an identical method as printAdress
	//but is declared private
	private void printAddressPriv() {
		System.out.println(this.toString());
	}

	public int getOdometer() {
		return odometer;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return "Make: " + getMake() + "\nModel: " + getModel() + "\nMiles(Odometer): " + getOdometer();
	}
}
