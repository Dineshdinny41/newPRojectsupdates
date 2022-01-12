package org.cons;

public class Construct {
	private Construct() {
      System.out.println("-----SATHYAM CINEMAS-----");
	}
	public  Construct(String a) {
		System.out.println("MOVIE NAME:"+ a);
		
	}
	public Construct(int b ,int c) {
		int d = 02;
		System.out.println("NO OF SEATS:"+ d);
		System.out.println("SEAT NO:"+ b);
		System.out.println("SEAT NO:"+ c);
	}
	public Construct(float e) {
		String f = "12/11/2021";
		System.out.println("DATE:"+ f);
		System.out.println("TIMING:"+ e);
		System.out.println("---- THANK YOU----");
	}
public static void main(String[] args) {
	Construct co = new Construct();
	Construct co1 = new Construct("DOCTOR");
	Construct co2 = new Construct(10,11);
	Construct co3= new Construct(12.25f);
	
}
}
