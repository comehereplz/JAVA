package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}
	}

}
