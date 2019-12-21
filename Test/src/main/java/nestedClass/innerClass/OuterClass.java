package main.java.nestedClass.innerClass;

public class OuterClass {
	
	// static member 
    static int outer_x = 10; 
      
    // instance(non-static) member 
    int outer_y = 20; 
      
    // private member 
    private static int outer_private = 30; 
      	
	class InnerClass {
		 int outer_y = 500; 
		 int inner_y = 1000; 
		 
		 
		 void display() 
	        { 
	            // can access static member of outer class 
	            System.out.println("outer_x = " + outer_x); 
	              
	            // can access display private static member of outer class 
	            System.out.println("outer_private = " + outer_private); 
	              
	            // The following statement will give compilation error 
	            // as static nested class cannot directly access non-static membera 
	             System.out.println("outer_y = " + OuterClass.this.outer_y); 
	          
	        } 
    }

}
