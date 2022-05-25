package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
	public static String[] getMembers() {
		String[] members = { "오세연", "박지원", "김진주" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
	}

}
