package creational.prototypepattern;

//Concrete Prototype
public class Tom implements Person {
	
	private String name = "Tom";
	private int age = 29;
	
	public Tom(){
		System.out.println("Some time consuming operation is done to initialize an instance of Tom");
		this.age = 27;
	}
	
	//using copy constructor cloning
	public Tom(Tom tom){
		this.age = tom.age;
	}

	@Override
	public Person clone() {
		return new Tom(this);
	}

	@Override
	public String toString() {
		return "Tom [name=" + name + ", age=" + age + "]";
	}

}
