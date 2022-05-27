package org.opentutorials.javatutorials.classinstance;

class Calculator3 {
	int left, right;

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator3.sum(10, 20); // 30
		Calculator3.avg(10, 20); // 15

		Calculator3.sum(20, 40); // 60
		Calculator3.avg(20, 40); // 30
	}

}
