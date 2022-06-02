package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\test\b.txt");	// 1
		} catch (FileNotFoundException e) {	// 2 : 예외가 발생했을 때 실행된다.
			System.out.println(e); // 예외 클래스의 toString() 메서드 호출
			return;	// 강제 종료
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("항상 실행"); // 정상 출력
	}

}
