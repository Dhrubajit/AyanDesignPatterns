package main.java.OverloadingAndOverriding;

public class Multiplier {
    
	/*
	 * public int multiply(int a, int b) {
	 * System.out.println("-------    int multiply(int a, int b)     ----------");
	 * 
	 * return a * b; }
	 */
     
    public int multiply(int a, int b, int c) {
    	System.out.println("-------    int multiply(int a, int b, int c)     ----------");
        return a * b * c;
    }
     
    public double multiply(double a, double b) {
    	System.out.println("-------    double multiply(double a, double b)    ----------");
        return a * b;
    }
    
    public double multiply(int a, long b) {
    	System.out.println("-------    double multiply(int a, long b)    ----------");
        return a * b;
    }
}
