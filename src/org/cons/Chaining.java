package org.cons;

public class Chaining {
	public Chaining() {
		this(8072018953l);
		System.out.println("****STAY SAFE-WEAR MASK****");
	}
	public Chaining(long a) {
		this("WEST MADA STREET,THIRUVOTTIYUR,CHENNAI");
		System.out.println("PHONE NUMBER:"+ a);
	}
	public Chaining(String b) {
		this(60);
		System.out.println("ADDRESS:"+ b);
	}
	public Chaining(short c) {
		this(2);
		System.out.println("TOTAL AMOUNT:"+ c);
	}
	public Chaining(byte d) {
		this("DINESH","VIGNESH");
		System.out.println("NO OF PERSONS:"+ d);
	}
	public Chaining(String e,String f) {
		this("12/11/2011",4.00);
		System.out.println("NAME:"+ e);
		System.out.println("NAME:"+ f);
	}
	public Chaining(String g,double h) {
		System.out.println("****THIRUPATHI DHEVASTHANAM****");
		System.out.println("DATE OF DHARISANAM:"+ g);
		System.out.println("TIMING:"+ h);
	}
	public static void main(String[] args) {
		Chaining ch = new Chaining();
	}

}
