package generics;

public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic 재료입니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Plastic입니다.";
	}
}
