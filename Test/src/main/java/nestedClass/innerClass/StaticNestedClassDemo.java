package main.java.nestedClass.innerClass;

public class StaticNestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // accessing a static nested class 
		OuterClass outerClass=new OuterClass();
        //OuterClass.InnerClass nestedObject = new outerClass.InnerClass(); 
        OuterClass.InnerClass innerObject = outerClass.new InnerClass();
          
        innerObject.display(); 
	}

}
