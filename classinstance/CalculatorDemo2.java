package org.opentutorials.javatutorials.classinstance;

class Calculator2 {
	static double PI = 3.14;
	// 클래스 변수인 base가 추가되었다.
	static int base = 0;
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		// 더하기에 base의 값을 포함시킨다.
		System.out.println(left + right + base);
	}

	public void avg() {
		// 평균치에 base의 값을 포함시킨다.
		System.out.println((left + right + base) / 2);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		c1.sum(); // 30

		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		c2.sum(); // 60

		// 클래스 변수 base의 값을 10으로 지정했다.
		Calculator2.base = 10;
		c1.sum(); // 40
		c2.sum(); // 70
	}

}
