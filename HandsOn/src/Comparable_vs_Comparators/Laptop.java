package Comparable_vs_Comparators;

import java.lang.Comparable;

public class Laptop implements Comparable<Laptop> {
	private String type;
	private int ram;
	private int price;
	
	//Constructor
	public Laptop(String type, int ram, int price) {
		super();
		this.type = type;
		this.ram = ram;
		this.price = price;
	}

	// Getter and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [type=" + type + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if (this.getRam() > o.getRam()) {
			return 1;
		} else {
			return -1;
		}
	}
}
