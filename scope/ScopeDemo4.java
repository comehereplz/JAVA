package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
	static void a() {
		String title = "comehereplz";
	}

	public static void main(String[] args) {
		a();
		// System.out.println(title);	title은 메소드 a에서만 유효
	}

}
