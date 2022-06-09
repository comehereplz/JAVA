package iotest;

import java.io.IOException;

public class InputStreamTest2 {

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
			
				for(s = 0; s < 12; s++) {
					if(jung[s] == input[s]) {
						System.out.print('O');
						cnt++;
					} else {
					System.out.print('X');
					}
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