package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if((id.equals("comehereplz") || id.equals("sy0706") || id.equals("noeyesh0"))
				&& password.equals("010706")) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
	}

}
