package iotest;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int s = 0; // 첨자
		int cnt = 0; // 맞은 개수
		byte[] input = new byte[256]; // 1byte = 2^8 >> 최대 256
		char[] jung = { 'A', 'p', 'p', 'l', 'e', ' ', 'B', 'a', 'n', 'a', 'n', 'a' };
		// jung는 타자 정답 원문
		System.out.println(jung);
		
		try {
			System.in.read(input, 0, 12); 
			System.out.println(new String(input));
			while(true) {
				// 만약에 input과 jung의 같은 위치의 값이 같으면
				// 'o'를 출력하고
				// 정답 개수 증가
			
				// 그렇지 않다면
				// 'x' 출력
				
				// 위치첨자 수 증가해서 다음 문자 준비
				// 글자 수 다 검사하면 break;
				for(s = 0; s < 12; s++) {
					if(jung[s] == input[s]) {
						System.out.print('O');
						cnt++;
					} else {
					System.out.print('X');
					}
				}
				break;
			}
			System.out.println();
			System.out.println("맞은 개수 : " + cnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// 문제
// Apple Banana
// apple benana
// xoooooxxoooo
// 맞은 개수 : 9자