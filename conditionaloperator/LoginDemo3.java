package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("comehereplz") && password.equals("010706")) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
	}

}
