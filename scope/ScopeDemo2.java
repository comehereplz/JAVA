package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i;	// 전역 변수(global variables)

	static void a() {
		i = 0;
	}

	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
