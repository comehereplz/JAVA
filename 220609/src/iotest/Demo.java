package iotest;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		int i = 0;
		try {
			while(true) {
				i = System.in.read();
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
