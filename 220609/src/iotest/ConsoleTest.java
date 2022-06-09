package iotest;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console(); // 콘솔 클래스 반환

		System.out.println("name: ");
		String name = console.readLine();
		System.out.println("job: ");
		String job = console.readLine();
		System.out.println("password: ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);

		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
