package com.add;

public class AdditionOf_two_Number {

	void m1() {
		int a=10;
		int b=20;
		int  sum =a+b;
		System.out.println(sum);
		System.out.println("kar tr sahi");
		System.out.println("systrace ");
		System.out.println("AdditionOf_two_Number.m1()");
		System.out.println("tushar bhau kale bhimani");
		System.out.println("tushar bhau  ");
	}
	void m3() {
		System.out.println("AdditionOf_two_Number.m3()");
		//  systrace == yani konty calss madhali konti method ahe  mahit hote
		System.err.println();
	}

	public static void main(String[] args) {
		AdditionOf_two_Number obj=new AdditionOf_two_Number();
		obj.m1();
	}

}
