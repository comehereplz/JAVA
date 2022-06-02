package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");	// 1
		} catch (FileNotFoundException e) {	// 2
			System.out.println("파일이 존재하지 않습니다");
			System.out.println(e); // 예외 클래스의 toString() 메서드 호출
		}
		System.out.println("프로그램 종료"); // 정상 출력
	}

}
