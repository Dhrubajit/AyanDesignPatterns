package main.java.InterfaceInJava8;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle car = new Car("BMW");
		    System.out.println(car.getBrand());
		    System.out.println(car.speedUp());
		    System.out.println(car.slowDown());
		    System.out.println(car.turnAlarmOn());
		    System.out.println(car.turnAlarmOff());

	}

}
