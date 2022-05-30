package org.opentutorials.javatutorials.scope;

public class ScopeDemo {

	static void a() {
		int i = 0;	// 지역 변수(local variables)
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
