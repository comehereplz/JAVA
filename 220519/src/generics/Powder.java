package generics;

public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료입니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Powder입니다.";
	}
}


// 추상 클래스 abstract
// 추상 메소드, 일반 메소드
// extends 조상

// 인터페이스 interface
// 추상 메소드
// implements 조상 