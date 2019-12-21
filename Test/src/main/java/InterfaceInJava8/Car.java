package main.java.InterfaceInJava8;

public class Car implements Vehicle {
	 
    private String brand;
     
    // constructors/getters
     
    @Override
    public String getBrand() {
        return brand;
    }
     
    public Car(String brand) {
		super();
		this.brand = brand;
	}

	@Override
    public String speedUp() {
        return "The car is speeding up.";
    }
     
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}