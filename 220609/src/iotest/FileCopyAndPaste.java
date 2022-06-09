package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyAndPaste {

	public static void main(String[] args) {
		String src = "/Users/oseyeon/eclipse-workspace/SchoolClass/220609/hero.png";
		String target = "/Users/oseyeon/eclipse-workspace/SchoolClass/220609/cute.png";

		FileInputStream fis = null;
		FileOutputStream fos = null;

		int n = 0;
		int cnt = 0;
		int tot = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(target);

			byte[] buf = new byte[1024];
			while ((n = fis.read(buf)) != -1) {
				fos.write(n);
				fos.flush();
				cnt++; // 1024 단이 개수
				System.out.println(n);
				tot += n; // 전체 용량
			}
			System.out.println("총 " + cnt + "줄");
			System.out.println(tot + "바이트가 복사되었습니다.");

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
