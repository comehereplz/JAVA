package org.opentutorials.javatutorials.classinstance;

class Calculator {
	static double PI = 3.14; // 클래스 변수 : 모든 인스턴스가 공유하는 변수
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI); // 3.14

		Calculator c2 = new Calculator();
		System.out.println(c2.PI); // 3.14

		System.out.println(Calculator.PI); // 3.14
	}
}
