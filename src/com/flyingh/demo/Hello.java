package com.flyingh.demo;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello world!!!");
		System.out.println(add(1, 1));
		System.out.println(mul(2, 3));
		System.out.println("aaa");
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	private static int add(int a, int b) {
		return a + b;
	}

	public static int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
