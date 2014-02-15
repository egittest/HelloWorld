package com.flyingh.demo;

public class Hehe {
	public static void main(String[] args) {
		say();
	}

	private static void say() {
		System.out.println("Hehe");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		if (b == 0) {
			System.out.println("/ by zero");
			return;
		}
		System.out.println(a / b);
	}

	public void sum(int... ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		System.out.println(sum);
	}

}
