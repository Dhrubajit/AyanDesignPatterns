package creational.prototypepattern;

//Concrete Prototype
public class Dick implements Person {

	private String name = "Dick";
	private int age;

	public Dick(){
		System.out.println("Some time consuming operation is done to initialize an instance of Dick");
		this.age = 28;
	}

	//using copy constructor cloning
	public Dick(Dick dick){
		this.age = dick.age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public Person clone() {
		return new Dick(this);
	}

	@Override
	public String toString() {
		return "Dick [name=" + name + ", age=" + age + "]";
	}
	

}
