package iotest;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/Users/oseyeon/eclipse-workspace/SchoolClass/220609/test.txt");
			int cnt = 0;
			int n = 0;
			while ((n = fis.read()) != -1) {
				System.out.print((char) n);
				cnt++;
			}
			fis.close();
			System.out.println("\n총 " + cnt + "바이트입니다.");
		} catch (IOException e) {
			System.out.println("입력 오류");
		}
	}

}
