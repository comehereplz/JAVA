package generics;

public class Water extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료입니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Water입니다.";
	}

}
