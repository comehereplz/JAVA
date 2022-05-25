package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = {"오세연", "박지원", "김진주"};
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이(가) 상담을 받았습니다.");
		}
	}

}
