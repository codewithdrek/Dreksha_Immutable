package com.immutable;

public final class ImmutableClass {

	/*
	 * There are many immutable classes like String, Boolean, Byte, Short, Integer,
	 * Long, Float, Double etc. In short, all the wrapper classes and String class
	 * is immutabl
	 */
	/*
	 * Q1. What is the difference between Singleton and immutable? Design Ans.
	 * Singleton class will have only one instance through out your application.
	 * Once the instance has been created, you can use it to change the state of
	 * that object, whereas for immutable class you cannot change the value that
	 * means you cannot change the state of it once assigned.
	 */

	final String pancardNumber;

	public ImmutableClass(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}

/*
 * The class must be declared as final so that child classes can’t be created.
 * Data members in the class must be declared private so that direct access is
 * not allowed. Data members in the class must be declared as final so that we
 * can’t change the value of it after object creation. A parameterized
 * constructor should initialize all the fields performing a deep copy so that
 * data members can’t be modified with an object reference. Deep Copy of objects
 * should be performed in the getter methods to return a copy rather than
 * returning the actual object reference)
 */

//n this example, we have created a final class named Student. It has three final data members, 
//a parameterized constructor, and getter methods. Please note that there is no setter method here. 
//Also, note that we don’t need to perform deep copy or cloning of data members of wrapper types as they
//are already immutable.