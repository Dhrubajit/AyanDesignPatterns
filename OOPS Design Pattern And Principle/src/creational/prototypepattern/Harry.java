package creational.prototypepattern;


//Concrete Prototype
public class Harry implements Person {
	
	private String name = "Harry";
	private int age;
	
	public Harry(){
		System.out.println("Some time consuming operation is done to initialize an instance of Harry");
		this.age = 27;
	}
	
	//using copy constructor cloning
	public Harry(Harry harry){
		this.age = harry.age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public Person clone() {
		return new Harry(this);
	}

	@Override
	public String toString() {
		return "Harry [name=" + name + ", age=" + age + "]";
	}
	
}
