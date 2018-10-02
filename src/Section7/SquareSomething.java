package Section7;

public class SquareSomething {

	/*
	 * A few primitive data types to handle whichever
	 * type comes in through the respective, overloaded constructor
	 * */
	int integerNum;
	double doubleNum;
	float floatNum;
	
	/*
	 * Three consecutive constructors that are considered to be
	 * overloaded because they have the same header
	 * and take only different data types as 
	 * parameters
	 * */
	public SquareSomething(int newIntegerNum) {
		integerNum = newIntegerNum;
	}
	
	public SquareSomething(double newDoubleNum) {
		doubleNum = newDoubleNum;
	}
	
	public SquareSomething(float newFloatNum) {
		floatNum = newFloatNum;
	}
	
	/*Three consecutive getters for returning the value
	 * of each possible input's square*/
	public int getIntegerNumSq(int integerNum) {
		return integerNum*integerNum;
	}
	
	public double getDoubleNumSq(double doubleNum) {
		return doubleNum*doubleNum;
	}
	
	public float getFloatNumSq(float floatNum) {
		return floatNum*floatNum;
	}
}
