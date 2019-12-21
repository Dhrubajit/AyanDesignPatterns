package main.java.nestedClass;

public class AccessTest {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	static class NestedClass{
		private String nestedName;
		NestedClass(String name){
			this.nestedName=name;
		}
	}
	
	

}
