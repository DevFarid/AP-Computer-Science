//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Thing {

	// make a String to store type
	private String type;
	// make a String to store name
	private String name;
	// make a double to store size
	private double size;

	// add a constrcutor
	public Thing(String type, String name, double size) {
		setType(type);
		setName(name);
		setSize(size);
	}

	// add set methods
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSize(double size) {
		this.size = size;
	}

	// add get methods
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	// add a toString
	@Override
	public String toString() {
		return getType() + " " + getName() + " " + String.format("%.2f", getSize());
	}
}
