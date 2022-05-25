package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering();
		numbering();	// 재활용, 코드량 줄일 수 있음, 유지보수 유리
		numbering();
		numbering();
	}

}
