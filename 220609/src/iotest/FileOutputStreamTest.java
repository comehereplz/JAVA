package iotest;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/oseyeon/eclipse-workspace/SchoolClass/220609/star.txt", true);
			// true는 출력문을 추가하는 기능

			int n = 0;
			System.out.println("내용을 입력하세요 >> ");

			while ((n = System.in.read()) != -1) {
				fos.write(n);
				fos.flush();
			}
			System.in.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
