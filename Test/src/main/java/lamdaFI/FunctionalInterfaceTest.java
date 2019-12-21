package main.java.lamdaFI;

public class FunctionalInterfaceTest {

	interface FunctionalInterface1 {
		int operation(int a, int b);
	}

	interface FunctionalInterface2 {
		String operation(String s);
	}

	private int operate1(int a, int b, FunctionalInterface1 fobj) {
		return fobj.operation(a, b);
	}

	private String operate2(String s, FunctionalInterface2 fobj) {
		return fobj.operation(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		FunctionalInterface1 add=(x,y)->(x+y);
		FunctionalInterface1 multiply=(x,y)->(x*y);
		
		FunctionalInterface2 stringConcat=(x)->(x+" Hello...!");
		
		FunctionalInterfaceTest obj1= new FunctionalInterfaceTest();
		
		System.out.println("Addition is " + 
				obj1.operate1(10, 20, add));
		
		System.out.println(""
				+ "multiplication is " + 
				obj1.operate1(10, 20, multiply));
		
		System.out.println("Addition is " + 
				obj1.operate2("My Name i Dhruv", stringConcat));
		//============================================
		System.out.println("===================================");
		
		int x=10;
		long x1=10;
		//Long z=10;
		double x2=10;
		
		long a=10l;
		//Long b=10;
		
		
	}

}