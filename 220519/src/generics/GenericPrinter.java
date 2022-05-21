package generics;

// ** T extends Material 	<< 인터페이스 형식으로 구현한 내용이라도 implements를 쓰면 안 된다.

public class GenericPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
}
