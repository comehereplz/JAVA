package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"오세연", "박지원", "김진주"};
		for(String e : members) {
			System.out.println(e +"이(가) 상담을 받았습니다.");
		}
	}

}
