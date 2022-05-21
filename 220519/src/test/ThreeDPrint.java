package test;

public class ThreeDPrint<T> {	// 제네릭 클래스	T: type의 약자. 자료형 매개변수
	private T meterial;
	
	public T getMeterial() {
		return meterial;
	}
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
}
