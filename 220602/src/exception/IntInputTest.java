package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntInputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;	// 개수
		int total = 0;	// 합계

		for(int i = 0; i < 3; i++) {
			try {
				System.out.print((i + 1) + ">> ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");	// 경고문 출력
				sc.nextLine();	
				i--;
				continue;
			}
			total += num;
		}
		System.out.println("합계 : " + total);

	}

}
